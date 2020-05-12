package com.os.onlineshoppingconsumer.feign.impl;

import com.alibaba.fastjson.JSONObject;
import com.os.onlineshoppingconsumer.feign.ProductFeign;
import com.os.onlineshoppingentity.entity.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: online-shopping
 * @description: ${description}
 * @author: qianjin
 * @create: 2020-05-12 14:17
 **/
@Service
public class ProductFeignImpl implements ProductFeign {
    @Resource
    private ProductFeign productFeign;

    @Override
    public String getProduct(){
        String string = productFeign.getProduct();
        Product product = JSONObject.parseObject(string,Product.class);
        product.setName("经过feign实现类转化后的姓名");
        return product.toString();
    }
}
