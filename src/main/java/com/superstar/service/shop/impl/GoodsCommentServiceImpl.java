package com.superstar.service.shop.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.superstar.dao.shop.GoodsCommentMapper;
import com.superstar.dao.shop.GoodsMapper;
import com.superstar.dao.system.UserMapper;
import com.superstar.enums.CommentType;
import com.superstar.model.common.RtData;
import com.superstar.model.shop.Goods;
import com.superstar.model.shop.GoodsComment;
import com.superstar.model.shop.GoodsCommentExample;
import com.superstar.model.shop.Vm.GoodsCommentDetail;
import com.superstar.model.system.User;
import com.superstar.service.shop.GoodsCommentService;
import com.superstar.util.DataUtils;
import com.superstar.util.ResponseBuilder;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午10:33 2018/10/15.
 */
@Service
public class GoodsCommentServiceImpl  implements GoodsCommentService{
    @Autowired
    private GoodsCommentMapper commentMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private UserMapper userMapper;



    @Override
    public synchronized boolean commentGoods() {

        //订单是否是本人的

        //确认订单是未评论的

        //保存评论记录



        //修改商品平均评分

        return true;
    }

    @Override
    public RtData getGoodsComments(long goodsId,int commentType, int pageNo, int pageSize) {
        GoodsCommentExample commentExample = new GoodsCommentExample();
        commentExample.setOrderByClause("create_time desc");
        commentExample.createCriteria().andGoodsIdEqualTo(goodsId);
        if(commentType== CommentType.Good.getType()){
            commentExample.getOredCriteria().get(0).andScoreEqualTo(CommentType.Good.getMinScore());

        }else if(commentType==CommentType.Middle.getType()){
            commentExample.getOredCriteria().get(0).andScoreGreaterThan(CommentType.Middle.getMinScore()).andScoreLessThan(CommentType.Middle.getMaxScore());

        }else if(commentType==CommentType.Poor.getType()){
            commentExample.getOredCriteria().get(0).andScoreLessThanOrEqualTo(CommentType.Poor.getMaxScore());

        }


        PageHelper.startPage(pageNo, pageSize);
        Page<GoodsComment> goodsComments = (Page<GoodsComment>) commentMapper.selectByExample(commentExample);
        List<GoodsCommentDetail> commentDetailList = new ArrayList<>();
        for (GoodsComment comment:goodsComments) {
            GoodsCommentDetail commentDetail = new GoodsCommentDetail();
            try{

                PropertyUtils.copyProperties(commentDetail,comment);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            User user = userMapper.selectByPrimaryKey(comment.getUserId());
            commentDetail.setCusPicture(user.getPicture());
            commentDetail.setNick(user.getNick());
            commentDetailList.add(commentDetail);

        }
        RtData rtData = ResponseBuilder.success();
        rtData.setList(commentDetailList);
        rtData.setTotal(goodsComments.getTotal());
        rtData.setCount(goodsComments.size());
        return rtData;
    }
}
