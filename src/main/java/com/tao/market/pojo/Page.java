package com.tao.market.pojo;

import org.springframework.web.bind.annotation.RequestBody;

public class Page {
    //private int category;//分类ID
    private Integer size = 10;// 数量
    private Integer page = 1;//分页

    private Integer category;
    private Integer brand;
    private Integer type;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Page{" +
                "size=" + size +
                ", page=" + page +
                ", category=" + category +
                ", brand=" + brand +
                ", type=" + type +
                '}';
    }
}
