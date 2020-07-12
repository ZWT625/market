package com.tao.market.mapper;

import com.tao.market.pojo.Type;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeMapper {

    @Delete("delete * from Tb_type where id = #{id}")
    int deleteByPrimaryKey(Integer id);
    @Insert("insert into Tb_Type(type) values(#{type}")
    int insert(Type record);
    @Select("select * from Tb_Type where id = #{id}")
    Type selectByPrimaryKey(Integer id);
    @Update("update Tb_Type set type = #{type} where id = #{id}")
    int updateByPrimaryKey(Type record);
    @Select("select * from Tb_Type")
    List<Type> selectByAll();

}
