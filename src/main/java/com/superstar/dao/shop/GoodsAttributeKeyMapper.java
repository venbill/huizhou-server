package com.superstar.dao.shop;

import com.superstar.model.shop.GoodsAttributeKey;
import com.superstar.model.shop.GoodsAttributeKeyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsAttributeKeyMapper {
    int deleteByExample(GoodsAttributeKeyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsAttributeKey record);

    int insertSelective(GoodsAttributeKey record);

    List<GoodsAttributeKey> selectByExample(GoodsAttributeKeyExample example);

    GoodsAttributeKey selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsAttributeKey record, @Param("example") GoodsAttributeKeyExample example);

    int updateByExample(@Param("record") GoodsAttributeKey record, @Param("example") GoodsAttributeKeyExample example);

    int updateByPrimaryKeySelective(GoodsAttributeKey record);

    int updateByPrimaryKey(GoodsAttributeKey record);


}