package com.tao.market.mapper;

import com.tao.market.pojo.Item;
import com.tao.market.pojo.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemMapper {
    @Delete("delete * from Tb_Item where id = #{id}")
    int deleteByPrimaryKey(Integer id);
    @Insert("insert into Tb_Item (cid, tid, \n" +
            "      brandId, title, img, originalPrice, \n" +
            "      realPrice, label)\n" +
            "    values  #{cid}, #{tid}, \n" +
            "      #{brandId}, #{title}, #{img}, #{originalPrice}, \n" +
            "      #{realPrice}, #{label})")
    int insert(Item record);
    @Select("select * from Tb_Item where id = #{id}")
    Item selectByPrimaryKey(Integer id);
    @Update("update Tb_Item\n" +
            "    set cid = #{cid},\n" +
            "      tid = #{tid},\n" +
            "      brandId = #{brandId},\n" +
            "      title = #{title},\n" +
            "      img = #{img},\n" +
            "      originalPrice = #{originalPrice},\n" +
            "      realPrice = #{realPrice},\n" +
            "      label = #{label}\n" +
            "    where id = #{id}")
    int updateByPrimaryKey(Item record);
    @Select("select * from Tb_Item")
    List<Item> selectByAll();
}
