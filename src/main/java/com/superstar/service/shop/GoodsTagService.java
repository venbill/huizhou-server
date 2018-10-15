package com.superstar.service.shop;

import com.github.pagehelper.Page;
import com.superstar.model.common.RtData;
import com.superstar.model.shop.Goods;
import com.superstar.model.shop.GoodsTag;
import com.superstar.model.shop.Vm.GoodsShortInfo;
import com.superstar.model.shop.Vm.SearchVm;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午3:36 2018/10/13.
 */
public interface GoodsTagService {

    /**
     * 获取商品标签
     * @return
     */
    List<GoodsTag> getGoodsTags();


    /**
     * 获取tag详情
     * @param tagId
     * @return
     */
    GoodsTag getGoodsTag(int tagId);

    /**
     * 分页查询商品
     * @param tagId
     * @param pageNo
     * @param pageSize
     * @return
     */
    Page<Goods> getGoodsByTag(int tagId,int pageNo,int pageSize);


    /**
     * 获取标签和商品
     * @return
     */
    RtData getTagAndGoodsList();







}
