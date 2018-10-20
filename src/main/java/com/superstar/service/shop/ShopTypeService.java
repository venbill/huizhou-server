package com.superstar.service.shop;

import com.superstar.model.shop.ShopType;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午7:52 2018/10/18.
 */
public interface ShopTypeService {
    /**
     * 获取店铺商品类型
     * @return
     */
    List<ShopType> getShopTypeList();
}
