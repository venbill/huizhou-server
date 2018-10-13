package com.superstar.dao.goods;

import com.superstar.model.goods.GoodsBigType;
import com.superstar.model.goods.GoodsBigTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsBigTypeMapper {
    int deleteByExample(GoodsBigTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsBigType record);

    int insertSelective(GoodsBigType record);

    List<GoodsBigType> selectByExample(GoodsBigTypeExample example);

    GoodsBigType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsBigType record, @Param("example") GoodsBigTypeExample example);

    int updateByExample(@Param("record") GoodsBigType record, @Param("example") GoodsBigTypeExample example);

    int updateByPrimaryKeySelective(GoodsBigType record);

    int updateByPrimaryKey(GoodsBigType record);
}