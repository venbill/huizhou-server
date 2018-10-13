package com.superstar.controller.goods;

import com.superstar.model.common.RtData;
import com.superstar.service.goods.GoodsTypeService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午2:24 2018/10/13.
 */

@RequestMapping("/goodsType")
@RestController
@Api(description = "商品类型")
public class GoodsTypeController {
    @Autowired
    private GoodsTypeService goodsTypeService;

    @PermitAll
    @GetMapping("/bigTypes}")
    public RtData getBigTypes() {
        return ResponseBuilder.success(goodsTypeService.getGoodsBigTypeList());

    }

    @PermitAll
    @GetMapping("/detailTypes}")
    public RtData getDetailTypes() {
        return ResponseBuilder.success(goodsTypeService.getGoodsTypeDetailList());

    }





}
