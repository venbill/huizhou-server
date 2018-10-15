package com.superstar.controller.shop;

import com.superstar.model.common.RtData;
import com.superstar.service.shop.GoodsActivityService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午4:21 2018/10/13.
 */

@RequestMapping("/goodsActivity")
@RestController
@Api(description = "活动区域")
public class GoodsActivityController {
    @Autowired
    private GoodsActivityService activityService;

    @ApiOperation("获取商品活动区域")
    @PermitAll
    @GetMapping("/get")
    public RtData getGoodsActivity() {
        return ResponseBuilder.success(activityService.getGoodsActivityList());
    }





}
