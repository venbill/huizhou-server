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


    RtData getGoodsDetail(long goodsId);
}
