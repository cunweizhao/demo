package com.naolu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : ClientBApplication
 * @Description : 服务B
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 11:32
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientBApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientBApplication.class,args);
    }
}
