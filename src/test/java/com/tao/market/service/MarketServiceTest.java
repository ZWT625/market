package com.tao.market.service;

import com.tao.market.mapper.MarketMapper;
import com.tao.market.pojo.Category;
import com.tao.market.pojo.Item;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class MarketServiceTest {
    @Autowired
    private MarketService marketService;

    @Test
    void getItemList() {
        ArrayList<Item> items = marketService.GetItemListByCidAndTidAndBranId(1, 2, 2);
        System.out.println("-----------");
        MarketServiceTest.show(items);
    }

    @Test
    void getCategoryList() {
        ArrayList<Category> categories = marketService.GetCategoryList();
        for(int i =0;i<categories.size();i++){
            System.out.println(categories.get(i));
        }
    }


    @Test
    void getItemListbycid() {
        ArrayList<Item> items = marketService.GetItemListbycid(1);
        MarketServiceTest.show(items);
    }

    @Test
    void getItemListByTid() {
        ArrayList<Item> items = marketService.GetItemListbycid(1);
        MarketServiceTest.show(items);
    }

    @Test
    void getItemListByBrandId() {
        ArrayList<Item> items = marketService.GetItemListByBrandId(2);
        MarketServiceTest.show(items);
    }

    @Test
    void getItemListByCidAndTid() {
        ArrayList<Item> items = marketService.GetItemListByCidAndTid(1, 2);
        MarketServiceTest.show(items);
    }

    @Test
    void getItemListByCidAndBrandId() {
        ArrayList<Item> items = marketService.GetItemListByCidAndBrandId(1, 1);
        MarketServiceTest.show(items);
    }

    @Test
    void getItemListByTidAndBrandId() {
        ArrayList<Item> items = marketService.GetItemListByTidAndBrandId(2, 2);

        MarketServiceTest.show(items);
    }


    public  static void show (ArrayList<Item> list){
        if(list.size() != 0){
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            return;
        }
        System.out.println("数值为空");


    }
}