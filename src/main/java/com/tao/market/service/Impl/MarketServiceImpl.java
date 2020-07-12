package com.tao.market.service.Impl;

import com.tao.market.mapper.MarketMapper;
import com.tao.market.pojo.Category;
import com.tao.market.pojo.Item;
import com.tao.market.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
@Service
public class MarketServiceImpl  implements MarketService {
    @Autowired
    private MarketMapper marketMapper;



    @Override
    public ArrayList<Category> GetCategoryList() {
        return marketMapper.GetCategoryList();
    }

    @Override
    public ArrayList<Item> GetItemList() {
        return marketMapper.GetItemList();
    }

    @Override
    public ArrayList<Item> GetItemListByCidAndTidAndBranId(int cid, int tid, int brandId) {
        return marketMapper.GetItemListByCidAndTidAndBranId(cid,tid,brandId);
    }

    @Override
    public ArrayList<Item> GetItemListbycid(int cid) {
        return marketMapper.GetItemListbycid(cid);
    }

    @Override
    public ArrayList<Item> GetItemListByTid(int tid) {
        return marketMapper.GetItemListByTid(tid);
    }

    @Override
    public ArrayList<Item> GetItemListByBrandId(int brandId) {
        return marketMapper.GetItemListByBrandId(brandId);
    }

    @Override
    public ArrayList<Item> GetItemListByCidAndTid(int cid, int tid) {
        return marketMapper.GetItemListByCidAndTid(cid,tid);
    }

    @Override
    public ArrayList<Item> GetItemListByCidAndBrandId(int cid, int brandId) {
        return marketMapper.GetItemListByCidAndBrandId(cid,brandId);
    }

    @Override
    public ArrayList<Item> GetItemListByTidAndBrandId(int tid, int brandId) {
        return marketMapper.GetItemListByTidAndBrandId(tid,brandId);
    }
}
