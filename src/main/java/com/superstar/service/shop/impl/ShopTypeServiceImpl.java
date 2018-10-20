package com.superstar.service.shop.impl;

import com.superstar.dao.shop.ShopTypeMapper;
import com.superstar.model.shop.ShopType;
import com.superstar.model.shop.ShopTypeExample;
import com.superstar.service.shop.ShopTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:店铺商品分类
 * @Date: Created in 下午7:53 2018/10/18.
 */
@Service
public class ShopTypeServiceImpl implements ShopTypeService {
    @Autowired
    private ShopTypeMapper shopTypeMapper;


    @Override
    public List<ShopType> getShopTypeList() {
        List<ShopType> shopTypes = shopTypeMapper.selectByExample(new ShopTypeExample());
        return shopTypes;
    }
}
