package com.superstar.controller.shop;

import com.superstar.model.common.RtData;
import com.superstar.model.shop.Vm.SearchVm;
import com.superstar.service.shop.GoodsActivityService;
import com.superstar.service.shop.GoodsTagService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午4:21 2018/10/13.
 */

@RequestMapping("/goodsTag")
@RestController
@Api(description = "标签")
public class GoodsTagController {
    @Autowired
    private GoodsTagService tagService;

    @ApiOperation("获取标签详情")
    @PermitAll
    @GetMapping("/getTag/{id}")
    public RtData getTagGoods(@PathVariable int tagId) {
        return ResponseBuilder.success(tagService.getGoodsTag(tagId));
    }






    @ApiOperation("根据tagId获取商品")
    @PermitAll
    @GetMapping("/getGoodsByTag")
    public RtData getTagAndGoods(@RequestBody SearchVm searchVm) {
        return tagService.getTagAndGoodsList();
    }



    @ApiOperation("获取首页下面几个区域标签和商品")
    @PermitAll
    @GetMapping("/getTagAndGoods")
    public RtData getTagAndGoods() {
        return tagService.getTagAndGoodsList();
    }









}
