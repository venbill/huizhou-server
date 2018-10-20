package com.superstar.service.homestay;

import com.superstar.model.homestay.ScenicSpot;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午2:56 2018/10/20.
 */
public interface ScenicSpotService {
    /**
     * 获取景区列表
     * @return
     */
    List<ScenicSpot> getScenicSpotList();
}
