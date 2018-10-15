package com.superstar.dao.shop;

import com.superstar.model.shop.GoodsSmallType;
import com.superstar.model.shop.GoodsSmallTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsSmallTypeMapper {
    int deleteByExample(GoodsSmallTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSmallType record);

    int insertSelective(GoodsSmallType record);

    List<GoodsSmallType> selectByExample(GoodsSmallTypeExample example);

    GoodsSmallType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSmallType record, @Param("example") GoodsSmallTypeExample example);

    int updateByExample(@Param("record") GoodsSmallType record, @Param("example") GoodsSmallTypeExample example);

    int updateByPrimaryKeySelective(GoodsSmallType record);

    int updateByPrimaryKey(GoodsSmallType record);
}