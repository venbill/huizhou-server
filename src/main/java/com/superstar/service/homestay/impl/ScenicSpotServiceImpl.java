package com.superstar.service.homestay.impl;

import com.superstar.dao.homestay.ScenicSpotMapper;
import com.superstar.model.homestay.ScenicSpot;
import com.superstar.model.homestay.ScenicSpotExample;
import com.superstar.service.homestay.ScenicSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午2:58 2018/10/20.
 */
@Service
public class ScenicSpotServiceImpl implements ScenicSpotService {
    @Autowired
    private ScenicSpotMapper scenicSpotMapper;


    @Override
    public List<ScenicSpot> getScenicSpotList() {
        return scenicSpotMapper.selectByExample(new ScenicSpotExample());
    }
}
