package com.kotoha.openfeign.impl;

import com.kotoha.openfeign.OrderControllerFeign;
import com.kotoha.util.ResponseDTO;
import org.springframework.stereotype.Component;


public class OrderControllerFeignImpl implements OrderControllerFeign {
    @Override
    public String getOrderList() {
        return null;
    }

    @Override
    public ResponseDTO test() {


        System.out.println("发生熔断了");
        return ResponseDTO.error("熔断了，网络异常");
    }

    @Override
    public int getOrderById(int id) {
        return 0;
    }
}
