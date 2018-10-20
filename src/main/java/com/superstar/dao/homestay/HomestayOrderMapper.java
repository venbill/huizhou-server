package com.superstar.dao.homestay;

import com.superstar.model.homestay.HomestayOrder;
import com.superstar.model.homestay.HomestayOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface HomestayOrderMapper {
    int deleteByExample(HomestayOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HomestayOrder record);

    int insertSelective(HomestayOrder record);

    List<HomestayOrder> selectByExample(HomestayOrderExample example);

    HomestayOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HomestayOrder record, @Param("example") HomestayOrderExample example);

    int updateByExample(@Param("record") HomestayOrder record, @Param("example") HomestayOrderExample example);

    int updateByPrimaryKeySelective(HomestayOrder record);

    int updateByPrimaryKey(HomestayOrder record);
}