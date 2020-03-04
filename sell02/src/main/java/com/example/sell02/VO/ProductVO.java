package com.example.sell02.VO;

import lombok.Data;

import java.util.List;
@Data
public class ProductVO {
    private String description;
    private String icon;
    private String image;
    private String info;
    private String name;
    private String oldPrice;
    private double price;
    private  int rating;
    private int sellCount;
    private List<RattingVO>ratings;
}
