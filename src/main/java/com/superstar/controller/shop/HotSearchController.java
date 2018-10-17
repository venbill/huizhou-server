package com.superstar.controller.shop;

import com.superstar.model.common.RtData;
import com.superstar.service.shop.GoodsTypeService;
import com.superstar.service.shop.HotSearchService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午8:36 2018/10/16.
 */
@RequestMapping("/hot-search")
@RestController
@Api(description = "热搜")
public class HotSearchController {
    @Autowired
    private HotSearchService hotSearchService;

    @PermitAll
    @GetMapping("/get")
    public RtData getHotSearchList() {
        return ResponseBuilder.success(hotSearchService.getHotSearchList());

    }

}
