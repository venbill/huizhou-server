package com.superstar.controller.buy;

import com.superstar.model.buy.DeliveryAddress;
import com.superstar.model.common.RtData;
import com.superstar.security.SecurityUtils;
import com.superstar.service.buy.DeliveryAddressService;
import com.superstar.service.shop.GoodsActivityService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午10:04 2018/10/18.
 */
@RequestMapping("/deliveryAddress")
@RestController
@Api(description = "收货地址")
public class DeliveryAddressController {




        @Autowired
        private DeliveryAddressService deliveryAddressService;

        @ApiOperation("获取用户收货地址列表")
        @GetMapping("/list/user")
        public RtData getUserDeliveryAddressList() {
            return ResponseBuilder.success(deliveryAddressService.getUserDeliveryAddress(SecurityUtils.getCurrentUserId()));
        }


        @ApiOperation(" 添加收货地址")
        @PostMapping("/user/insert")
        public RtData insertUserDeliverAddress(@RequestBody DeliveryAddress deliveryAddress) {
            return ResponseBuilder.success(deliveryAddressService.insertDeliveryAddress(deliveryAddress));
        }


        @ApiOperation("删除收货地址")
        @DeleteMapping("/user/delete/{id}")
        public RtData deleteUserDeliveryAddressList(@PathVariable long id) {
            return ResponseBuilder.success(deliveryAddressService.deleteDeliveryAddress(id,SecurityUtils.getCurrentUserId()));
        }


        @ApiOperation("编辑收货地址")
        @PutMapping("/user/update")
        public RtData updateUserDeliveryAddressList(@RequestBody DeliveryAddress deliveryAddress) {
            return ResponseBuilder.success(deliveryAddressService.updateDeliveryAddress(deliveryAddress));
        }



        @ApiOperation("设置默认收货地址")
        @GetMapping("/user/setDefault/{id}")
        public RtData setUserDefaultDeliveryAddress(@PathVariable long id) {
            return ResponseBuilder.success(deliveryAddressService.setDefaultDeliveryAddress(SecurityUtils.getCurrentUserId(),id));
        }












    }
