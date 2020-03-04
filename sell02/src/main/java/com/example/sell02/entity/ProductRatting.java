package com.example.sell02.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
public class ProductRatting {
    @TableId(type = IdType.AUTO)
    private int id;
    private String avatar;
    private Long rateTime;
    private int rateType;
    private String text;
    private String userName;
    private int productId;
}
