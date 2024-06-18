package com.kotoha.main;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RocketMqTest {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    @Value("${rocketmq.name-server}")
    private String a;
    @Test
    public void test(){
//        调用mq，发送消息

        System.out.println(a);
        rocketMQTemplate.convertAndSend("test", "hello");

    }

}