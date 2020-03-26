package com.naolu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName : GatewayApplication
 * @Description : 网关
 * @Author : Zhaocunwei
 * @Date: 2020-03-24 11:01
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
