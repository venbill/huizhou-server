package com.superstar.service.goods.impl;

import com.superstar.dao.goods.GoodsBigTypeMapper;
import com.superstar.dao.goods.GoodsSmallTypeMapper;
import com.superstar.model.goods.GoodsBigType;
import com.superstar.model.goods.GoodsBigTypeExample;
import com.superstar.model.goods.GoodsSmallTypeExample;
import com.superstar.model.goods.Vm.GoodsTypeDetail;
import com.superstar.service.goods.GoodsTypeService;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午2:04 2018/10/13.
 */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired
    private GoodsSmallTypeMapper smallTypeMapper;

    @Autowired
    private GoodsBigTypeMapper goodsBigTypeMapper;


    private final Logger log = LoggerFactory.getLogger(GoodsTypeServiceImpl.class);

    @Override
    public List<GoodsBigType> getGoodsBigTypeList() {
        GoodsBigTypeExample example = new GoodsBigTypeExample();
        List<GoodsBigType> goodsBigTypes = goodsBigTypeMapper.selectByExample(example);
        return goodsBigTypes;
    }

    @Override
    public List<GoodsTypeDetail> getGoodsTypeDetailList() {

        GoodsBigTypeExample bigTypeExample = new GoodsBigTypeExample();
        List<GoodsBigType> goodsBigTypes = goodsBigTypeMapper.selectByExample(bigTypeExample);
        List<GoodsTypeDetail> goodsTypeDetailList = new ArrayList<>();
        for (GoodsBigType bigType:goodsBigTypes) {
            GoodsTypeDetail type = new GoodsTypeDetail();
            try{

                PropertyUtils.copyProperties(bigType,type);
            }catch (Exception e){
                log.error("copy properties error");
                log.error(e.getMessage());
            }
            GoodsSmallTypeExample smallTypeExample = new GoodsSmallTypeExample();
            smallTypeExample.createCriteria().andBigTypeIdEqualTo(bigType.getId());

            type.setSmallTypes(smallTypeMapper.selectByExample(smallTypeExample));
            goodsTypeDetailList.add(type);
        }
        return goodsTypeDetailList;
    }
}
