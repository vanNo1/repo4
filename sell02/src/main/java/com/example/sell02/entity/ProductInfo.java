package com.example.sell02.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
public class ProductInfo {
    @TableId(type = IdType.AUTO)
    private int productId;
    private String productName;
    private double productPrice;
    private int productStock;
    private String productDescription;
    private String productIcon;
    private int categoryId;
    private String productImage;
    private String productInfo;
    private String  productOldprice;
    private int productRating;
    private int productSellcount;

}
