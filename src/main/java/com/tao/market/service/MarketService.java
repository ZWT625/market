package com.tao.market.service;


import com.tao.market.pojo.Category;
import com.tao.market.pojo.Item;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

public interface MarketService {
    ArrayList<Category> GetCategoryList();

    ArrayList<Item> GetItemList();
    ArrayList<Item> GetItemListByCidAndTidAndBranId(int cid, int tid, int brandId);
    ArrayList<Item> GetItemListbycid(int cid);
    ArrayList<Item> GetItemListByTid(int tid);
    ArrayList<Item> GetItemListByBrandId(int brandId);
    ArrayList<Item> GetItemListByCidAndTid(int cid,int tid);
    ArrayList<Item> GetItemListByCidAndBrandId(int cid, int brandId);
    ArrayList<Item> GetItemListByTidAndBrandId(int tid, int brandId);

}
