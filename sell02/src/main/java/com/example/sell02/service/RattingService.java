package com.example.sell02.service;

import com.example.sell02.entity.ProductRatting;

import java.util.List;

public interface RattingService {
    List<ProductRatting> selectAll();
    void insert(ProductRatting productRatting);
}
