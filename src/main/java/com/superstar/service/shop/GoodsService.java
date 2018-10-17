package com.superstar.service.shop;

import com.superstar.model.common.RtData;
import com.superstar.model.shop.Vm.GoodsDetail;
import com.superstar.model.shop.Vm.SearchVm;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午5:40 2018/10/13.
 */
public interface GoodsService {

    /**
     * 商品搜索
     * @param searchVm
     * @return
     */
    RtData searchGoods(SearchVm searchVm);

    /**
     * 获取商品详情
     * @param goodsId
     * @return
     */
    RtData getGoodsDetail(long goodsId);
}
