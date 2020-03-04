package com.example.sell02.service.impl;

import com.example.sell02.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
@Resource
CategoryServiceImpl categoryService;
    @Test
    public void selectById() {
//        ProductCategory productCategory= categoryService.selectById(1);
//        Assert.assertEquals(1,productCategory.getCategoryId());
    }

    @Test
    public void selectByType() {
    }

    @Test
    public void selectAll() {
//        CategoryServiceImpl categoryService=new CategoryServiceImpl();
//        you can new a bean
        List<ProductCategory>productCategories=categoryService.selectAll();
        for (ProductCategory productCategory:productCategories
             ) {
            System.out.println(productCategory);
        }
    }

    @Test
    public void updateById() {
    }

    @Test
   public void deleteById() {
    }

    @Test
   public void insert() {
    }
}