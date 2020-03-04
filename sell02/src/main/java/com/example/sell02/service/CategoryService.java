package com.example.sell02.service;

import com.example.sell02.entity.ProductCategory;

import java.util.List;

public interface CategoryService {
    ProductCategory selectById(int id);
    List<ProductCategory> selectByType(String type);
    List<ProductCategory> selectAll();
    void updateById(ProductCategory productCategory);
    void deleteById(int id);
    void insert(ProductCategory productCategory);

}
