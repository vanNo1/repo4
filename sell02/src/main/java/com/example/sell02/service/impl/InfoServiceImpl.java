package com.example.sell02.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.sell02.dao.ProductInfoMapper;
import com.example.sell02.entity.ProductInfo;
import com.example.sell02.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class InfoServiceImpl implements InfoService {
    @Resource
    private ProductInfoMapper productInfoMapper;
    @Override
    public ProductInfo selectById(String id) {
        ProductInfo productInfo=productInfoMapper.selectById(id);
        return productInfo;
    }

    @Override
    public List<ProductInfo> selectByName(String name) {
        List<ProductInfo> productInfos=productInfoMapper.selectList(
                new EntityWrapper<ProductInfo>().eq("product_name",name)
        );
        return productInfos;
    }

    @Override
    public List<ProductInfo> selectAll() {
        List<ProductInfo> productInfos=productInfoMapper.selectAll();
        return productInfos;
    }

    @Override
    public void insert(ProductInfo productInfo) {
        productInfoMapper.insert(productInfo);
    }
}
