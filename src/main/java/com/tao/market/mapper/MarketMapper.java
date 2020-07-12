package com.tao.market.mapper;

import com.tao.market.pojo.Category;
import com.tao.market.pojo.Item;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;


@Repository
public interface MarketMapper {
    @Select("select * from Tb_Category")
    ArrayList<Category> GetCategoryList();//获取分类列表

    @Select("select * from Tb_Item")
    ArrayList<Item> GetItemList();
    @Select("select * from Tb_Item where cid = #{cid} and tid = #{tid} and brandId = #{brandId}")
    ArrayList<Item> GetItemListByCidAndTidAndBranId( int cid, int tid, int brandId);
    @Select("select * from Tb_Item where cid = #{cid}")
    ArrayList<Item> GetItemListbycid(int cid);
    @Select("select * from Tb_Item where tid = #{tid}")
    ArrayList<Item> GetItemListByTid(int tid);
    @Select("select * from Tb_Item where brandId = #{brandId}")
    ArrayList<Item> GetItemListByBrandId(int brandId);
    @Select("select * from Tb_Item where cid = #{cid} and tid = #{tid}")
    ArrayList<Item> GetItemListByCidAndTid(int cid,int tid);
    @Select("select * from Tb_Item where cid = #{cid} and brandId = #{brandId}")
    ArrayList<Item> GetItemListByCidAndBrandId(int cid, int brandId);
    @Select("select * from Tb_Item where tid = #{tid} and brandId = #{brandId}")
    ArrayList<Item> GetItemListByTidAndBrandId(int tid, int brandId);
}
