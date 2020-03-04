package com.example.sell02.service.impl;

import com.example.sell02.dao.ProductRattingMapper;
import com.example.sell02.entity.ProductRatting;
import com.example.sell02.service.RattingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RattingServiceImpl implements RattingService {
    @Resource
    private ProductRattingMapper productRattingMapper;
    @Override
    public List<ProductRatting> selectAll() {
        List<ProductRatting> productRattings=productRattingMapper.selectAll();
        return productRattings;
    }

    @Override
    public void insert(ProductRatting productRatting) {
        productRattingMapper.insert(productRatting);
    }
}
