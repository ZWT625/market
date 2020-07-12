package com.tao.market.mapper;

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
class MarketMapperTest {
    @Autowired
    private MarketMapper marketMapper;
    @Test
    void getCategoryList() {
        ArrayList<Category> categories = marketMapper.GetCategoryList();
        for (int i=0;i<categories.size();i++) {
            System.out.println(categories.get(i));

        }

    }

    @Test
    void getItemList() {
        ArrayList<Item> items = marketMapper.GetItemListByCidAndTidAndBranId(1, 2, 2);
        System.out.println("-----------");
        for(int i=0;i<items.size();i++){
            System.out.println("////");
            System.out.println(items.get(i));
        }


    }
}