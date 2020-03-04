package com.example.sell02.VO;

import lombok.Data;

import java.util.List;
@Data
public class TypeVO {
    private String name;
    private int type;
    private List<ProductVO> foods;
}
