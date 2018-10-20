package com.superstar.dao.homestay;

import com.superstar.model.homestay.HomestayConfiguration;
import com.superstar.model.homestay.HomestayConfigurationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface HomestayConfigurationMapper {
    int deleteByExample(HomestayConfigurationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HomestayConfiguration record);

    int insertSelective(HomestayConfiguration record);

    List<HomestayConfiguration> selectByExample(HomestayConfigurationExample example);

    HomestayConfiguration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HomestayConfiguration record, @Param("example") HomestayConfigurationExample example);

    int updateByExample(@Param("record") HomestayConfiguration record, @Param("example") HomestayConfigurationExample example);

    int updateByPrimaryKeySelective(HomestayConfiguration record);

    int updateByPrimaryKey(HomestayConfiguration record);
}