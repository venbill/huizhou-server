package com.superstar.dao.shop;

import com.superstar.model.shop.GoodsPrice;
import com.superstar.model.shop.GoodsPriceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsPriceMapper {
    int deleteByExample(GoodsPriceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsPrice record);

    int insertSelective(GoodsPrice record);

    List<GoodsPrice> selectByExample(GoodsPriceExample example);

    GoodsPrice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsPrice record, @Param("example") GoodsPriceExample example);

    int updateByExample(@Param("record") GoodsPrice record, @Param("example") GoodsPriceExample example);

    int updateByPrimaryKeySelective(GoodsPrice record);

    int updateByPrimaryKey(GoodsPrice record);
}