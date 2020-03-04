package com.example.sell02.VO;

import lombok.Data;

import java.util.List;

@Data
public class ResultVO {
    private int errno;
    private List<TypeVO> data;
}
