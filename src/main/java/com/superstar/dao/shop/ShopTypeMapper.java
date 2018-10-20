package com.superstar.dao.shop;

import com.superstar.model.shop.ShopType;
import com.superstar.model.shop.ShopTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ShopTypeMapper {
    int deleteByExample(ShopTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopType record);

    int insertSelective(ShopType record);

    List<ShopType> selectByExample(ShopTypeExample example);

    ShopType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopType record, @Param("example") ShopTypeExample example);

    int updateByExample(@Param("record") ShopType record, @Param("example") ShopTypeExample example);

    int updateByPrimaryKeySelective(ShopType record);

    int updateByPrimaryKey(ShopType record);
}