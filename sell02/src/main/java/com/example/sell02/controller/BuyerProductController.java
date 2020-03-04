package com.example.sell02.controller;

import com.example.sell02.VO.ProductVO;
import com.example.sell02.VO.RattingVO;
import com.example.sell02.VO.ResultVO;
import com.example.sell02.VO.TypeVO;
import com.example.sell02.entity.ProductCategory;
import com.example.sell02.entity.ProductInfo;
import com.example.sell02.entity.ProductRatting;
import com.example.sell02.service.impl.CategoryServiceImpl;
import com.example.sell02.service.impl.InfoServiceImpl;
import com.example.sell02.service.impl.RattingServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sell/buyer/product")
public class BuyerProductController {
    //        create all impl classes
    @Resource
    private CategoryServiceImpl categoryService;
    @Resource
    private InfoServiceImpl infoService;
    @Resource
    private RattingServiceImpl rattingService;
    @GetMapping("/goods")
    public ResultVO list(){
//        create all vo List


        List<TypeVO> typeVOList=new ArrayList<>();
        ResultVO resultVO=new ResultVO();
//        ...................


//        .............................
//        create all the entity List
        List<ProductCategory> productCategoryList=categoryService.selectAll();
        List<ProductInfo> productInfoList=infoService.selectAll();
        List<ProductRatting> productRattingList=rattingService.selectAll();
//        ....................
//        convert entity list to Vo list
//        type
        for (ProductCategory productCategory:productCategoryList
             ) {
//            copy(VO)
            TypeVO typeVO=new TypeVO();
            typeVO.setName(productCategory.getCategoryName());
            typeVO.setType(productCategory.getCategoryType());

//            ............
//            create productVOList
            List<ProductVO> productVOList= new ArrayList<>();
//            ....................................
//            for each product
            for (ProductInfo productInfo:productInfoList
            ) {
//                copy(VO)
                ProductVO productVO=new ProductVO();
                productVO.setDescription(productInfo.getProductDescription());
                productVO.setIcon(productInfo.getProductIcon());
                productVO.setName(productInfo.getProductName());
                productVO.setPrice(productInfo.getProductPrice());
                productVO.setSellCount(productInfo.getProductSellcount());
//                .....................................
//                create rattingVOList
                List<RattingVO> rattingVOList=new ArrayList<>();
//                .........................
//                for each rating
                for (ProductRatting productRatting:productRattingList
                ) {
//                    cope(VO)
                    RattingVO rattingVO=new RattingVO();
                    rattingVO.setAvatar(productRatting.getAvatar());
                    rattingVO.setRateTime(productRatting.getRateTime());
                    rattingVO.setRateType(productRatting.getRateType());
                    rattingVO.setText(productRatting.getText());
                    rattingVO.setUserName(productRatting.getUserName());
//                    ..........................
//                    if rating eq product
                    if (productRatting.getProductId()==productInfo.getProductId()){
                        rattingVOList.add(rattingVO);
                    }
                }
                productVO.setRatings(rattingVOList);
//                already create a full productVO.............
//                if product eq type
                if (productInfo.getCategoryId()==productCategory.getCategoryId()){
                    productVOList.add(productVO);
                }
            }
            typeVO.setFoods(productVOList);
//            already create a full typeVO...................
typeVOList.add(typeVO);

        }
        resultVO.setData(typeVOList);
        return resultVO;

    }
}
