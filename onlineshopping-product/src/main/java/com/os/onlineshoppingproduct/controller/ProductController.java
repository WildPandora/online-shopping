package com.os.onlineshoppingproduct.controller;

import com.alibaba.fastjson.JSONObject;
import com.os.onlineshoppingentity.entity.Product;
import com.os.onlineshoppingproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: online-shopping
 * @description: ${description}
 * @author: qianjin
 * @create: 2020-05-11 10:58
 **/
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET,value = "/test")
    public String getProudct(){
        Product product = productService.getProduct();
        return JSONObject.toJSONString(product);
    }

}
