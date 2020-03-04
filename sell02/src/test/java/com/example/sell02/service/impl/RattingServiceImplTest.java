package com.example.sell02.service.impl;

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
public class RattingServiceImplTest {
@Resource
    private RattingServiceImpl rattingService;
@Test
    public  void selectAll(){
   List<ProductRatting> productRattings=rattingService.selectAll();
    for (ProductRatting productRatting:productRattings
         ) {
        System.out.println(productRatting);
    }
}
}