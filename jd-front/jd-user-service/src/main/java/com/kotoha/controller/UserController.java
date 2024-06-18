package com.kotoha.controller;

import com.kotoha.openfeign.OrderControllerFeign;
import com.kotoha.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//用于进行配置热更新
@RefreshScope
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OrderControllerFeign orderControllerFeign;

    @RequestMapping("/getMyOrderList")
    public String getMyOrderList() {

        //服务之间相互通信，需要建一个配置类
        String forObject = restTemplate.getForObject("http://jd-order-service/order/getOrderList", String.class);
        System.out.println(forObject);
        return forObject;
    }

    @RequestMapping("/test")
    public ResponseDTO test() {
//        ResponseDTO forObject = restTemplate.getForObject("http://jd-order-service/order/test", ResponseDTO.class);
//        return forObject;
//
        ResponseDTO test = orderControllerFeign.test();
        return test;
    }


    @RequestMapping("/getOrderById")
    public int getOrderById() {
        int orderById = orderControllerFeign.getOrderById(2);
        System.out.println(orderById);
        return orderById;
    }

    @RequestMapping("/ok")
    public String nothingTest(){
        return "123OK";
    }




}
