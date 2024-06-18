package com.kotoha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateApp
{
    public static void main( String[] args )
    {

        SpringApplication.run( GateApp.class, args );

        System.out.println( "Hello World!" );
    }
}
