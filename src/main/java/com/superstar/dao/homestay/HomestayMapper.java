package com.superstar.dao.homestay;

import com.superstar.model.homestay.Homestay;
import com.superstar.model.homestay.HomestayExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HomestayMapper {
    int deleteByExample(HomestayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Homestay record);

    int insertSelective(Homestay record);

    List<Homestay> selectByExample(HomestayExample example);

    Homestay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Homestay record, @Param("example") HomestayExample example);

    int updateByExample(@Param("record") Homestay record, @Param("example") HomestayExample example);

    int updateByPrimaryKeySelective(Homestay record);

    int updateByPrimaryKey(Homestay record);
}