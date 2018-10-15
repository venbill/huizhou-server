package com.superstar.service.system.impl;

import com.superstar.dao.system.BannerMapper;
import com.superstar.model.system.Banner;
import com.superstar.model.system.BannerExample;
import com.superstar.service.system.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午11:31 2018/10/15.
 */
@Service
public class BannerServiceImpl implements BannerService{

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> getEnableBannerList(int type) {
        BannerExample bannerExample = new BannerExample();
        bannerExample.createCriteria().andTypeEqualTo(type).andIsEnableEqualTo(true);
        return bannerMapper.selectByExample(bannerExample);

    }


    @Override
    public List<Banner> getBannerList(int type) {

        BannerExample bannerExample = new BannerExample();
        bannerExample.createCriteria().andTypeEqualTo(type);
        return bannerMapper.selectByExample(bannerExample);
    }
}
