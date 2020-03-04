package com.example.sell02.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.sell02.entity.ProductCategory;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {
@Select("SELECT category_id AS categoryId,category_name AS categoryName,category_type AS categoryType FROM product_category")
List<ProductCategory> selectAll();
}

