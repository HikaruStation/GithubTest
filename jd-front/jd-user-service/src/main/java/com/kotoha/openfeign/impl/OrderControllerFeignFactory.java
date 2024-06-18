package com.kotoha.openfeign.impl;

import com.kotoha.openfeign.OrderControllerFeign;
import com.kotoha.util.ResponseDTO;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class OrderControllerFeignFactory implements FallbackFactory<OrderControllerFeign> {
    @Override
    public OrderControllerFeign create(Throwable cause) {
        //打印错误信息
        cause.printStackTrace();
        System.out.println("发生熔断了");
        //返回实现类
        return new OrderControllerFeignImpl();
    }
}
