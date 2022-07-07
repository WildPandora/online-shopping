package com.os.onlineshoppingconsumer.controller;

import com.os.onlineshoppingconsumer.feign.impl.ProductFeignImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: online-shopping
 * @description: ${description}
 * @author: qianjin
 * @create: 2020-05-12 15:14
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private ProductFeignImpl productFeign;

    /**
     * 消费者测试
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/getConsumer")
    public String getConsumer(){
        String product = productFeign.getProduct();
        return product;
    }
}
