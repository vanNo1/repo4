package com.example.sell02.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.sell02.entity.ProductInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductInfoMapper extends BaseMapper<ProductInfo> {
    @Select("SELECT product_id AS productId,product_name AS productName,product_price AS productPrice,product_stock AS productStock,product_description AS productDescription,product_icon AS productIcon,category_id AS categoryId FROM product_info")
    List<ProductInfo> selectAll();
}
