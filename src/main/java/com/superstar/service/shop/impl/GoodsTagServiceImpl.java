package com.superstar.service.shop.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.superstar.dao.shop.GoodsActivityMapper;
import com.superstar.dao.shop.GoodsMapper;
import com.superstar.dao.shop.GoodsTagMapper;
import com.superstar.model.common.RtData;
import com.superstar.model.shop.*;
import com.superstar.model.shop.Vm.GoodsShortInfo;
import com.superstar.model.shop.Vm.SearchVm;
import com.superstar.model.shop.Vm.TagGoods;
import com.superstar.service.shop.GoodsTagService;
import com.superstar.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午3:36 2018/10/13.
 */
@Service
public class GoodsTagServiceImpl implements GoodsTagService {

    @Autowired
    private GoodsTagMapper tagMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsActivityMapper activityMapper;

    @Override
    public List<GoodsTag> getGoodsTags() {
        GoodsTagExample tagExample = new GoodsTagExample();
        return tagMapper.selectByExample(tagExample);
    }

    @Override
    public GoodsTag getGoodsTag(int tagId) {
        return tagMapper.selectByPrimaryKey(tagId);
    }

    @Override
    public Page<Goods> getGoodsByTag(int tagId, int pageNo, int pageSize) {
        String tagStr = String.format("%0" + 3 + "d",tagId );

        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andTagsLike("%"+tagStr+"%");
        PageHelper.startPage(pageNo, pageSize);
        Page<Goods> goods = (Page<Goods>) goodsMapper.selectByExample(goodsExample);
        return goods;
    }


    @Override
    public RtData getTagAndGoodsList() {
        List<TagGoods> tagGoodsList = new ArrayList<>();

        List<GoodsTag>  goodsTags = getGoodsTags();

        for (GoodsTag tag:goodsTags) {

            TagGoods tagGoods = new TagGoods();
            tagGoods.setTagId(tag.getId());
            tagGoods.setTagName(tag.getTagName());

            //待优化 不应该差这么多无效属性值
            List<Goods> goods = getGoodsByTag(tag.getId(),0,6);
            List<GoodsShortInfo> goodsList = new ArrayList<>();
            for (Goods item: goods) {
                GoodsShortInfo goodsShortInfo = GoodsShortInfo.getFromGoods(item);
                goodsList.add(goodsShortInfo);

            }
            tagGoods.setGoods(goodsList);

            tagGoodsList.add(tagGoods);

        }
        return ResponseBuilder.success(tagGoodsList);

    }

}
