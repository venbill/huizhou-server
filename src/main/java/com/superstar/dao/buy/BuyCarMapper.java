package com.superstar.dao.buy;

import com.superstar.model.buy.BuyCar;
import com.superstar.model.buy.BuyCarExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BuyCarMapper {
    int deleteByExample(BuyCarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BuyCar record);

    int insertSelective(BuyCar record);

    List<BuyCar> selectByExample(BuyCarExample example);

    BuyCar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BuyCar record, @Param("example") BuyCarExample example);

    int updateByExample(@Param("record") BuyCar record, @Param("example") BuyCarExample example);

    int updateByPrimaryKeySelective(BuyCar record);

    int updateByPrimaryKey(BuyCar record);
}