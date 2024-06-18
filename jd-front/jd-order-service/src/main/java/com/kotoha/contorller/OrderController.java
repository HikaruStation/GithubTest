package com.kotoha.contorller;

import com.kotoha.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("getOrderList")
    public String getOrderList() {

        System.out.println("111111111");
        return "123456";
    }


    @RequestMapping("test")
    public ResponseDTO test() {
        return ResponseDTO.success(port);
    }

    @RequestMapping("getOrderById")
    public int getOrderById( int id){
        return id;
    }
}
