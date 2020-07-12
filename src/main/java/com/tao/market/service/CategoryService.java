package com.tao.market.service;

import com.tao.market.pojo.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CategoryService {
    int deleteByPrimaryKey(Integer id);
    Category selectByPrimaryKey(Integer id);
    int insert(Category record);
    int updateByPrimaryKey(Category record);
    List<Category> selectByAll();
}
