package com.example.sell02.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
public class ProductCategory {
    @TableId(type = IdType.AUTO)
    private int categoryId;
    private String categoryName;
    private int categoryType;
}
