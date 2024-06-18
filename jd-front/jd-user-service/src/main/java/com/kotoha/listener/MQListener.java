package com.kotoha.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(topic = "test", consumerGroup = "${rocketmq.consumer.group}")
public class MQListener implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("我收到了"+s);
    }
}