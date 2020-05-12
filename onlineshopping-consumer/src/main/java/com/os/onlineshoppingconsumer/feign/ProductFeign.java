package com.os.onlineshoppingconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: online-shopping
 * @description: ${description}
 * @author: qianjin
 * @create: 2020-05-12 14:17
 **/
@FeignClient(name = "onlineshopping-product",url = "http://localhost:7012/onlineshopping-product-server/product")
@Component
public interface ProductFeign {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String getProduct();
}
