package com.tao.market.pojo;

public class Item {
    private Integer id;

    private Integer cid;//分类id+
    private Integer tid;//类型id
    private Integer brandId;//品牌id

    private String title;

    private String img;

    private String originalPrice;

    private String realPrice;

    private String label;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", cid=" + cid +
                ", tid=" + tid +
                ", brandId=" + brandId +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", originalPrice='" + originalPrice + '\'' +
                ", realPrice='" + realPrice + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(String realPrice) {
        this.realPrice = realPrice;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}