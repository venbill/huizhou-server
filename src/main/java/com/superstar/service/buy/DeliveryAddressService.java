package com.superstar.service.buy;

import com.superstar.model.buy.DeliveryAddress;
import com.superstar.model.common.RtData;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午9:02 2018/10/18.
 */
public interface DeliveryAddressService {

    /**
     * 获取用户收件地址
     * @param userId
     * @return
     */
    List<DeliveryAddress> getUserDeliveryAddress(long userId);

    /**
     * 添加收货地址
     * @param deliveryAddress
     * @return
     */
    RtData insertDeliveryAddress(DeliveryAddress deliveryAddress);


    /**
     * 删除收货地址
     * @param deliveryAddressId
     * @param userId
     * @return
     */
    RtData deleteDeliveryAddress(long deliveryAddressId,long userId);


    /**
     * 修改收货地址
     * @param deliveryAddress
     * @return
     */
    RtData updateDeliveryAddress(DeliveryAddress deliveryAddress);


    /**
     * 根据id 获取详情
     * @param id
     * @return
     */
    DeliveryAddress getDeliveryAddressById(long id);

    /**
     * 设置默认收货地址
     * @param userId
     * @param deliveryAddressId
     * @return
     */
    RtData setDefaultDeliveryAddress(long userId,long deliveryAddressId);
}
