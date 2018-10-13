package com.superstar.service.goods;

import com.superstar.model.goods.GoodsBigType;
import com.superstar.model.goods.Vm.GoodsTypeDetail;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午2:04 2018/10/13.
 */
public interface GoodsTypeService {

    List<GoodsBigType> getGoodsBigTypeList();

    List<GoodsTypeDetail> getGoodsTypeDetailList();


}
