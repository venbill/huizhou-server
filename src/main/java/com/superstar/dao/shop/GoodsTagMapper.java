package com.superstar.dao.shop;

import com.superstar.model.shop.GoodsTag;
import com.superstar.model.shop.GoodsTagExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GoodsTagMapper {
    int deleteByExample(GoodsTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsTag record);

    int insertSelective(GoodsTag record);

    List<GoodsTag> selectByExample(GoodsTagExample example);

    GoodsTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsTag record, @Param("example") GoodsTagExample example);

    int updateByExample(@Param("record") GoodsTag record, @Param("example") GoodsTagExample example);

    int updateByPrimaryKeySelective(GoodsTag record);

    int updateByPrimaryKey(GoodsTag record);
}