package com.superstar.controller.shop;

import com.superstar.model.common.RtData;
import com.superstar.model.shop.Vm.SearchVm;
import com.superstar.service.shop.GoodsActivityService;
import com.superstar.service.shop.GoodsService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午5:39 2018/10/13.
 */
@RequestMapping("/goods")
@RestController
@Api(description = "商品")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @ApiOperation("搜索")
    @PermitAll
    @GetMapping("/search")
    public RtData searchGoods( SearchVm searchVm) {
        return goodsService.searchGoods(searchVm);
    }

    @ApiOperation("详情")
    @PermitAll
    @GetMapping("/detail/{id}")
    public RtData getGoodsDetail(@PathVariable long id) {
        return goodsService.getGoodsDetail(id);
    }




}







