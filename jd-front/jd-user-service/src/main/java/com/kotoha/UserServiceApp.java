package com.kotoha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class UserServiceApp
{
    public static void main( String[] args )
    {

        ConfigurableApplicationContext run = SpringApplication.run(UserServiceApp.class, args);

//        获得配置属性
        System.out.println(run.getEnvironment().getProperty("spring.redis.host"));
    }
}
