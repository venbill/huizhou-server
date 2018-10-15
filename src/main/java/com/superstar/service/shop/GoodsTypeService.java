package com.superstar.service.shop;

import com.superstar.model.shop.GoodsBigType;
import com.superstar.model.shop.Vm.GoodsTypeDetail;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午2:04 2018/10/13.
 */
public interface GoodsTypeService {

    /**
     * 获取商品大分类
     * @return
     */
    List<GoodsBigType> getGoodsBigTypeList();


    /**
     * 获取商品分类详情
     * @return
     */
    List<GoodsTypeDetail> getGoodsTypeDetailList();


}
