package com.tao.market.service.Impl;


import com.tao.market.mapper.TypeMapper;
import com.tao.market.pojo.Type;
import com.tao.market.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return typeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Type record) {
        return typeMapper.insert(record);
    }

    @Override
    public Type selectByPrimaryKey(Integer id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Type record) {
        return typeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Type> selectByAll() {
        return typeMapper.selectByAll();
    }
}
