package com.superstar.controller.homestay;

import com.superstar.model.common.RtData;
import com.superstar.security.SecurityUtils;
import com.superstar.service.homestay.ScenicSpotService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午3:00 2018/10/20.
 */
@RequestMapping("/buyCar")
@RestController
@Api(description = "scenicSpot")
public class ScenicSpotController {
    @Autowired
    private ScenicSpotService scenicSpotService;




    @ApiOperation("获取旅游景点列表")
    @GetMapping("/list")
    public RtData getUserGoodsNum() {
        return ResponseBuilder.success(scenicSpotService.getScenicSpotList());
    }
}
