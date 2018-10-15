package com.superstar.dao.shop;

import com.superstar.model.shop.GoodsAttributeValue;
import com.superstar.model.shop.GoodsAttributeValueExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsAttributeValueMapper {
    int deleteByExample(GoodsAttributeValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsAttributeValue record);

    int insertSelective(GoodsAttributeValue record);

    List<GoodsAttributeValue> selectByExample(GoodsAttributeValueExample example);

    GoodsAttributeValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsAttributeValue record, @Param("example") GoodsAttributeValueExample example);

    int updateByExample(@Param("record") GoodsAttributeValue record, @Param("example") GoodsAttributeValueExample example);

    int updateByPrimaryKeySelective(GoodsAttributeValue record);

    int updateByPrimaryKey(GoodsAttributeValue record);
}