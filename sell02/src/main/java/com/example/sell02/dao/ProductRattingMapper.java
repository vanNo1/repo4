package com.example.sell02.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.sell02.entity.ProductRatting;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductRattingMapper extends BaseMapper<ProductRatting> {
@Select("SELECT id AS id,avatar,rate_time AS rateTime,rate_type AS rateType,`text`,user_name AS userName,product_id AS productId FROM product_ratting")
    List<ProductRatting> selectAll();
}
