package com.superstar.controller.shop;

import com.superstar.model.common.RtData;
import com.superstar.model.shop.Vm.GoodsCommentsSearchVm;
import com.superstar.service.shop.GoodsCommentService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

/**
 * @Author: BillYu
 * @Description:商品评论
 * @Date: Created in 下午11:42 2018/10/15.
 */
@RequestMapping("/shop/comments")
@RestController
@Api(description = "商品评论")
public class GoodsCommentController {

    @Autowired
    private GoodsCommentService goodsCommentService;


    @ApiOperation("分页查询商品评论")
    @PermitAll
    @GetMapping("/getPage")
    public RtData getPageComments(GoodsCommentsSearchVm searchVm){

        return ResponseBuilder.success(goodsCommentService.getGoodsComments(searchVm.getGoodsId(),searchVm.getPageNo(),searchVm.getPageSize()));
    }

}
