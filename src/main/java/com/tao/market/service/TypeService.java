package com.tao.market.service;

import com.tao.market.pojo.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TypeService {
    int deleteByPrimaryKey(Integer id);
    int insert(Type record);
    Type selectByPrimaryKey(Integer id);
    int updateByPrimaryKey(Type record);
    List<Type> selectByAll();
}
