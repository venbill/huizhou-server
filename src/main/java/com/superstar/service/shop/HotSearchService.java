package com.superstar.service.shop;

import com.superstar.model.shop.HotSearch;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午8:31 2018/10/16.
 */
public interface HotSearchService {
    /**
     * 获取热搜列表
     * @return
     */
    List<HotSearch> getHotSearchList();
}
