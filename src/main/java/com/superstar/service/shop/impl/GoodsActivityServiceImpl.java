package com.superstar.service.shop.impl;

import com.superstar.dao.shop.GoodsActivityMapper;
import com.superstar.model.shop.GoodsActivity;
import com.superstar.model.shop.GoodsActivityExample;
import com.superstar.service.shop.GoodsActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午3:36 2018/10/13.
 */

@Service
public class GoodsActivityServiceImpl implements GoodsActivityService {

    @Autowired
    private GoodsActivityMapper activityMapper;
    @Override
    public List<GoodsActivity> getGoodsActivityList() {

        GoodsActivityExample activityExample = new GoodsActivityExample();
        return activityMapper.selectByExample(activityExample);

    }
}
