package com.tao.market.service.Impl;

import com.tao.market.mapper.ItemMapper;
import com.tao.market.pojo.Item;
import com.tao.market.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return itemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Item record) {
        return itemMapper.insert(record);
    }

    @Override
    public Item selectByPrimaryKey(Integer id) {
        return itemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Item record) {
        return itemMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Item> selectByAll() {
        return itemMapper.selectByAll();
    }
}
