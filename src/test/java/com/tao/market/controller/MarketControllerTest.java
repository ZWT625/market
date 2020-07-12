package com.tao.market.controller;

import com.tao.market.pojo.Category;
import com.tao.market.pojo.Item;
import com.tao.market.service.MarketService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class MarketControllerTest {
    @Autowired
    private MarketService marketService;
    @Test
    void getItemList() {
        ArrayList<Category> categories = marketService.GetCategoryList();
        for(int i=0;i<categories.size();i++){
            System.out.println("////");
            System.out.println(categories.get(i));
        }

    }

    @Test
    void getCategoryList() {
        ArrayList<Item> items = marketService.GetItemListByCidAndTidAndBranId(1, 2, 2);
        System.out.println("-----------");
        for(int i=0;i<items.size();i++){
            System.out.println("////");
            System.out.println(items.get(i));
        }
    }
}