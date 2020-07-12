package com.tao.market.service.Impl;

import com.tao.market.mapper.CategoryMapper;
import com.tao.market.pojo.Category;
import com.tao.market.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Category selectByPrimaryKey(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Category record) {
        return categoryMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Category record) {
        return categoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Category> selectByAll() {
        return categoryMapper.selectByAll();
    }
}
