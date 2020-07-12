package com.tao.market.mapper;

import com.tao.market.pojo.Category;
import com.tao.market.pojo.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {
    @Delete("delete * from Tb_Category where id = #{id}")
    int deleteByPrimaryKey(Integer id);
    @Select("select * from Tb_Category where id = #{id}")
    Category selectByPrimaryKey(Integer id);
    @Insert("insert into Tb_Category(name) values(#{name})")
    int insert(Category record);
    @Update("update Category set name = #{name} where id = #{id}")
    int updateByPrimaryKey(Category record);
    @Select("select * from Tb_Category")
    List<Category> selectByAll();
}
