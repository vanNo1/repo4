package com.example.sell02.service.impl;

import com.example.sell02.entity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class InfoServiceImplTest {
    @Resource
private InfoServiceImpl infoService;
    @Test
    public void selectAll(){
        List<ProductInfo>productInfos=infoService.selectAll();
        for (ProductInfo productInfo:productInfos
             ) {
            System.out.println(productInfo);
        }
    }
}