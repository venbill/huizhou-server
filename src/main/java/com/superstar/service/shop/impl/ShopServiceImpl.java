package com.superstar.service.shop.impl;

import com.superstar.dao.shop.ShopMapper;
import com.superstar.model.shop.Shop;
import com.superstar.service.shop.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 上午8:55 2018/10/19.
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;

    @Override
    public Shop getShopById(int shopId) {
        return shopMapper.selectByPrimaryKey(shopId);

    }
}
