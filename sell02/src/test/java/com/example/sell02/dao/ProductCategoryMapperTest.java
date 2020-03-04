package com.example.sell02.dao;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.sell02.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {
@Resource
    ProductCategoryMapper productCategoryMapper;
@Test
    public void selectById(){
    ProductCategory productCategory=productCategoryMapper.selectById(1);
    System.out.println(productCategory);

}
@Test
public void testSelectAll() {
    List<ProductCategory> productCategoryList = this.productCategoryMapper.selectAll();
    for (ProductCategory productCategory:productCategoryList
         ) {
        System.out.println(productCategory);
    }
}
@Test
    public void selectByName(){
    List<ProductCategory> productCategoryList = productCategoryMapper.selectList(
            new EntityWrapper<ProductCategory>().eq("category_name","girls favorite")
    );
    for (ProductCategory productCategory:productCategoryList) {
        System.out.println(productCategory);
    }
}
@Test
    public void updataById(){
    ProductCategory productCategory=new ProductCategory();
    productCategory.setCategoryId(1);
    productCategory.setCategoryName("girls favorite");
    productCategoryMapper.updateById(productCategory);
}
@Test
    public void insert(){
    ProductCategory productCategory=new ProductCategory();
    productCategory.setCategoryId(2);
    productCategory.setCategoryName("Hot Sell");
    productCategory.setCategoryType(3);
    productCategoryMapper.insert(productCategory);
}
@Test
    public void deleteById(){
    productCategoryMapper.deleteById(2);
}
}