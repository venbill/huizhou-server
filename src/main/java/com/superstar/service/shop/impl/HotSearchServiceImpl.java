package com.superstar.service.shop.impl;

import com.superstar.dao.shop.HotSearchMapper;
import com.superstar.model.shop.HotSearch;
import com.superstar.model.shop.HotSearchExample;
import com.superstar.service.shop.HotSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午8:32 2018/10/16.
 */
@Service
public class HotSearchServiceImpl implements HotSearchService {

    @Autowired
    private HotSearchMapper hotSearchMapper;

    @Override
    public List<HotSearch> getHotSearchList() {
        HotSearchExample hotSearchExample = new HotSearchExample();
        List<HotSearch> hotSearchList = hotSearchMapper.selectByExample(hotSearchExample);
        return hotSearchList;
    }
}
