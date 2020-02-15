package com.itheima.security.distributed.order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import tk.mybatis.spring.annotation.MapperScan;
/**
 * @author Administrator
 * @version 1.0
 **/
//@SpringBootApplication不要扫描到tk.mybatis.mapper.common.Mapper;
/*@SpringBootApplication(scanBasePackages = {"com.itheima.security.distributed.order.config","com.itheima.security.distributed.order.controller","com.itheima.security.distributed.order.filter"
,"com.itheima.security.distributed.order.service","com.itheima.security.distributed.config","com.itheima.security.distributed.feign.fallback","com.itheima.security.distributed.interceptor",
"com.itheima.security.distributed.service","com.itheima.security.distributed.dao"})*/
@SpringBootApplication(scanBasePackages ={"com.itheima.security.distributed"})
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan(basePackages = "com.itheima.security.distributed.dao")
@EnableFeignClients(basePackages = {"com.itheima.security.distributed.feign"})
@EnableAuthorizationServer
//@Import(FeignRequestConfiguration.class)
public class OrderServer {
    public static void main(String[] args) {
        SpringApplication.run(OrderServer.class, args);
    }
}
