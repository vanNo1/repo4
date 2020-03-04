package com.example.sell02.dao;

import com.example.sell02.entity.ProductRatting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRattingMapperTest {
    @Resource
    private ProductRattingMapper productRattingMapper;
    @Test
    public void selectById(){
        productRattingMapper.selectById(1);
    }
    @Test
    public void selectAll(){
        List<ProductRatting>productRattings =productRattingMapper.selectAll();
        for (ProductRatting productRatting:productRattings
             ) {
            System.out.println(productRatting);
        }
    }
}