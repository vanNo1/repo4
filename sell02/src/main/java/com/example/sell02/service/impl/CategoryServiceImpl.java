package com.example.sell02.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.sell02.dao.ProductCategoryMapper;
import com.example.sell02.entity.ProductCategory;
import com.example.sell02.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private ProductCategoryMapper productCategoryMapper;
    @Override
    public ProductCategory selectById(int id) {
        ProductCategory productCategory=productCategoryMapper.selectById(id);
        return productCategory;
    }

    @Override
    public List<ProductCategory> selectByType(String type) {
        List<ProductCategory> productCategoryList=productCategoryMapper.selectList(
                new EntityWrapper<ProductCategory>().eq("type",type)
        );
        return productCategoryList;
    }

    @Override
    public List<ProductCategory> selectAll() {

        return productCategoryMapper.selectAll();
    }

    @Override
    public void updateById(ProductCategory productCategory) {
        productCategoryMapper.updateById(productCategory);
    }

    @Override
    public void deleteById(int id) {
        productCategoryMapper.deleteById(id);
    }

    @Override
    public void insert(ProductCategory productCategory) {
        productCategoryMapper.insert(productCategory);
    }
}
