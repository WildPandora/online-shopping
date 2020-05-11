package com.os.onlineshoppingproduct.service.impl;

import com.os.onlineshoppingentity.entity.Product;
import com.os.onlineshoppingproduct.service.ProductService;

/**
 * @program: online-shopping
 * @description: ${description}
 * @author: qianjin
 * @create: 2020-05-11 14:39
 **/
public class ProductServiceImpl implements ProductService {

    @Override
    public String getProduct(){
        Product product = new Product();
        product.setAdd("修改后的地址");
        product.setAge(27);
        product.setName("修改后的姓名");
        product.setEmail("修改后的Email");
        return product.toString();
    }
}
