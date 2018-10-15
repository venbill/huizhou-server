package com.superstar.dao.shop;

import com.superstar.model.shop.GoodsActivity;
import com.superstar.model.shop.GoodsActivityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsActivityMapper {
    int deleteByExample(GoodsActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsActivity record);

    int insertSelective(GoodsActivity record);

    List<GoodsActivity> selectByExample(GoodsActivityExample example);

    GoodsActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsActivity record, @Param("example") GoodsActivityExample example);

    int updateByExample(@Param("record") GoodsActivity record, @Param("example") GoodsActivityExample example);

    int updateByPrimaryKeySelective(GoodsActivity record);

    int updateByPrimaryKey(GoodsActivity record);
}