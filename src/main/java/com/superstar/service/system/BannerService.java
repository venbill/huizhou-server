package com.superstar.service.system;

import com.superstar.model.system.Banner;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午11:25 2018/10/15.
 */
public interface BannerService {

    /**
     * 根据类型查询可用轮播图列表
     * @param type
     * @return
     */
    List<Banner> getEnableBannerList(int type);


    /**
     * 根据类型查询轮播图列表
     * @param type
     * @return
     */
    List<Banner> getBannerList(int type);


}
