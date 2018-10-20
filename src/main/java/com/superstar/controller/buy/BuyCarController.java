package com.superstar.controller.buy;

import com.superstar.model.buy.Vm.AddBuyCarGoodsVm;
import com.superstar.model.common.RtData;
import com.superstar.security.SecurityUtils;
import com.superstar.service.buy.BuyCarService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午10:04 2018/10/18.
 */
@RequestMapping("/buyCar")
@RestController
@Api(description = "购物车")
public class BuyCarController {


    @Autowired
    private BuyCarService buyCarService;


    @ApiOperation("获取用户购物车商品数量")
    @GetMapping("/user/GoodsNum")
    public RtData getUserGoodsNum() {
        return ResponseBuilder.success(buyCarService.getUserBuyCarGoodsNum(SecurityUtils.getCurrentUserId()));
    }


    @ApiOperation("分页获取用户购物车商品列表")
    @GetMapping("/user/GoodsList")
    public RtData getUserGoodsList(@PathParam("pageNo") int pageNo, @PathParam("pageSize") int pageSize) {
        return buyCarService.getUserBuyCarList(SecurityUtils.getCurrentUserId(), pageNo, pageSize);
    }


    @ApiOperation(" 添加商品到购物车")
    @PostMapping("/user/addGoods")
    public RtData userAddGoods(@RequestBody AddBuyCarGoodsVm addBuyCarGoodsVm) {
        return buyCarService.addGoodsToBuyCar(SecurityUtils.getCurrentUserId(), addBuyCarGoodsVm.getGoodsId(), addBuyCarGoodsVm.getNum(), addBuyCarGoodsVm.getSelectAttributeValues());
    }


    @ApiOperation(" 将商品从购物车中删除")
    @DeleteMapping("/user/deleteGoods/{buyCarId}")
    public RtData userDeleteGoods(@PathVariable("buyCarId") long buyCarId) {
        return buyCarService.deleteGoodsFromBuyCar(SecurityUtils.getCurrentUserId(), buyCarId);
    }


    @ApiOperation(" 修改购物车中的商品数量")
    @PutMapping("/user/updateGoodsNum/")
    public RtData userUpdateGoodsNum(@PathParam("buyCarId") long buyCarId, @Param("num") int num) {
        return buyCarService.updateBuyCarGoodsNo(SecurityUtils.getCurrentUserId(), buyCarId, num);
    }


}