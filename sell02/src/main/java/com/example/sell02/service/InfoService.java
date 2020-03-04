package com.example.sell02.service;

import com.example.sell02.entity.ProductInfo;

import java.util.List;

public interface InfoService {
    ProductInfo selectById(String id);
    List<ProductInfo> selectByName(String name);
    List<ProductInfo> selectAll();
    void insert(ProductInfo productInfo);
}
