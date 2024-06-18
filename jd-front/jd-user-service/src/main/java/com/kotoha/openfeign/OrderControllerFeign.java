package com.kotoha.openfeign;

import com.kotoha.openfeign.impl.OrderControllerFeignFactory;
import com.kotoha.openfeign.impl.OrderControllerFeignImpl;
import com.kotoha.util.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "jd-order-service",path = "/order",fallbackFactory = OrderControllerFeignFactory.class)
public interface OrderControllerFeign {

    @RequestMapping("getOrderList")
    public String getOrderList();

    @RequestMapping("test")
    public ResponseDTO test();

    @RequestMapping("getOrderById")
    int getOrderById(@RequestParam("id") int id);
}
