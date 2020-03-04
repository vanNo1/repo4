package com.example.sell02.dao;

import com.example.sell02.entity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith (SpringRunner.class)
@SpringBootTest
public class ProductInfoMapperTest {
@Resource
    private ProductInfoMapper productInfoMapper;
@Test
    public void selectById(){
    ProductInfo productInfo=productInfoMapper.selectById(1);
    System.out.println(productInfo);
}
@Test
    public void selectAll(){
    List<ProductInfo>productInfos=productInfoMapper.selectAll();
    for (ProductInfo productInfo:productInfos
         ) {
        System.out.println(productInfo);
    }
}
}