package com.superstar.controller.shop;

import com.superstar.model.common.RtData;
import com.superstar.service.shop.HotSearchService;
import com.superstar.service.shop.ShopTypeService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

/**
 * @Author: BillYu
 * @Description:店铺商品分类
 * @Date: Created in 下午2:38 2018/10/18.
 */

@RequestMapping("/shopGoodsType")
@RestController
@Api(description = "店铺商品分类")
public class ShopTypeController {
    @Autowired
    private ShopTypeService shopTypeService;

    @PermitAll
    @GetMapping("/all")
    public RtData getShopTypeList() {
        return ResponseBuilder.success(shopTypeService.getShopTypeList());

    }
}



