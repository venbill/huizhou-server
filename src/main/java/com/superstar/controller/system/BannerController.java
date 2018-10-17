package com.superstar.controller.system;

import com.superstar.model.common.RtData;
import com.superstar.model.system.vm.LoginVM;
import com.superstar.service.system.BannerService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午11:35 2018/10/15.
 */
@RequestMapping("/system")
@RestController
@Api(description = "轮播图")
public class BannerController {
    @Autowired
    private BannerService bannerService;


    @ApiOperation("根据类型查询可用的轮播图列表")
    @PermitAll
    @GetMapping("/banner/{type}")
    public RtData getBannerList(@PathVariable int type){

        return ResponseBuilder.success(bannerService.getEnableBannerList(type));
    }


}
