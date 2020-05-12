package com.os.onlineshoppingproduct.service.impl;

import com.os.onlineshoppingentity.entity.Product;
import com.os.onlineshoppingproduct.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: online-shopping
 * @description: ${description}
 * @author: qianjin
 * @create: 2020-05-11 14:39
 **/
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Override
    public Product getProduct(){
        Product product = new Product();
        product.setAdd("修改后的地址");
        product.setAge(27);
        product.setName("修改后的姓名");
        product.setEmail("修改后的Email");
        log.info("返回值为" + product.toString());
        return product;
    }
}
