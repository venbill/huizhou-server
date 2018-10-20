package com.superstar.service.shop;

import com.superstar.model.common.RtData;

/**
 * @Author: BillYu
 * @Description:商品评价
 * @Date: Created in 下午10:19 2018/10/15.
 */

public interface GoodsCommentService {

    /**
     * 评论商品
     * @return
     */
    boolean commentGoods();


    /**
     * 获取商品分页评价
     * @param goodsId
     * @param commentType
     * @param pageNo
     * @param pageSize
     * @return
     */
    RtData getGoodsComments(long goodsId,int commentType,int pageNo,int pageSize);



}
