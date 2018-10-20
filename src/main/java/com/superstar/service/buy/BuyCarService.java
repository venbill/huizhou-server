package com.superstar.service.buy;

import com.superstar.model.buy.Vm.BuyCarGoodsDetail;
import com.superstar.model.common.RtData;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午11:49 2018/10/18.
 */
public interface BuyCarService {
    /**
     * 获取用户购物车商品数量
     * @param userId
     * @return
     */
    long getUserBuyCarGoodsNum(long userId);

    /**
     * 分页查询用户购物车商品
     * @return
     */
    RtData getUserBuyCarList(long userId, int pageNo, int pageSize);


    /**
     * 添加商品到购物车
     * @param userId
     * @param goodsId
     * @param num
     * @param selectAttributeValues
     * @return
     */
    RtData addGoodsToBuyCar(long userId,long goodsId,int num,String selectAttributeValues);


    /**
     * 从购物车中删除
     * @param userId
     * @param buyCarId
     * @return
     */
    RtData deleteGoodsFromBuyCar(long userId,long buyCarId);


    /**
     * 修改购物车中商品数量
     * @param userId
     * @param buyCarId
     * @param num
     * @return
     */
    RtData updateBuyCarGoodsNo(long userId,long buyCarId,int num);



}
