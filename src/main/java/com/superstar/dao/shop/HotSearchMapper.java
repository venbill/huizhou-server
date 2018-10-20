package com.superstar.dao.shop;

import com.superstar.model.shop.HotSearch;
import com.superstar.model.shop.HotSearchExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HotSearchMapper {
    int deleteByExample(HotSearchExample example);

    int insert(HotSearch record);

    int insertSelective(HotSearch record);

    List<HotSearch> selectByExample(HotSearchExample example);

    int updateByExampleSelective(@Param("record") HotSearch record, @Param("example") HotSearchExample example);

    int updateByExample(@Param("record") HotSearch record, @Param("example") HotSearchExample example);
}