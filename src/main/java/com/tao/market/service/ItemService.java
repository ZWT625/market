package com.tao.market.service;

import com.tao.market.pojo.Item;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ItemService {

    int deleteByPrimaryKey(Integer id);

    int insert(Item record);

    Item selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Item record);

    List<Item> selectByAll();
}
