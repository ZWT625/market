package com.tao.market.controller;


import com.github.pagehelper.PageHelper;
import com.tao.market.pojo.*;
import com.tao.market.service.MarketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1/MarketController")
public class MarketController {
    @Autowired
    private MarketService marketService;

    private Send send;

    //获取商品列表,需要分页
    @ResponseBody
    @PostMapping(value = "/GetItemList",produces="application/json;charset=UTF-8")
   public Send GetItemList(@RequestBody Page page) {//@RequestBody Integer category,@RequestBody Integer brand,@RequestBody Integer type
        System.out.println(page);
        Integer cid = page.getCategory();//分类id
        Integer brandId = page.getBrand();//品牌id
        Integer tid = page.getType();//类型id

        Integer pageNum = page.getPage();
        Integer pageSize = page.getSize();

        PageHelper.startPage(pageNum, pageSize);//改写语句实现分页查询
        send = new Send();
        ArrayList<Item> array;
        if(cid != null & brandId != null & tid != null){//三个参数都不为null
            array = marketService.GetItemListByCidAndTidAndBranId(cid,tid,brandId);
                send.setMsg("success");
                send.setData(array);
                return send;
        }
        if(cid != null & brandId == null & tid == null){
            array = marketService.GetItemListbycid(cid);
                send.setMsg("success");
                send.setData(array);
                return send;
        }
        if(cid == null & brandId != null & tid == null){
            array = marketService.GetItemListByBrandId(brandId);
                send.setMsg("success");
                send.setData(array);
                return send;
        }
        if(cid == null & brandId == null & tid != null){
            array = marketService.GetItemListByTid(tid);
                send.setMsg("success");
                send.setData(array);
                return send;
        }
        if(cid != null & brandId != null & tid == null){
            array = marketService.GetItemListByCidAndBrandId(cid,brandId);
            send.setMsg("success");
            send.setData(array);
            return send;
        }
        if(cid != null & brandId == null & tid != null){
            array = marketService.GetItemListByCidAndTid(cid,tid);

            send.setMsg("success");
            send.setData(array);
            return send;
        }
        if(cid == null & brandId != null & tid != null){
            array = marketService.GetItemListByTidAndBrandId(tid,brandId);
            send.setMsg("success");
            send.setData(array);
            return send;

        }
        array = marketService.GetItemList();
        send.setMsg("success");
        send.setData(array);
        return send;

    }
   //获取分类列表
   @ResponseBody
   @PostMapping(value = "/GetCategoryList",produces="application/json;charset=UTF-8")
   public Send GetCategoryList(){
       send = new Send();
       System.out.println("到GetCategoryList方法了");
       ArrayList<Category> array = marketService.GetCategoryList();
           send.setMsg("success");
           send.setData(array);
           return send;
   }
}
