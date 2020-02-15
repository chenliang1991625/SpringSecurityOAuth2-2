package com.itheima.security.distributed;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import tk.mybatis.spring.annotation.MapperScan;
/**
 * @author Administrator
 * @version 1.0
 **/
@SpringBootApplication(scanBasePackages = {"com.itheima.security.distributed"})
@EnableDiscoveryClient
@EnableHystrix
//@EnableFeignClients(basePackages = {"com.itheima.security.distributed.feign"})
@EnableAuthorizationServer
@MapperScan(basePackages = {"com.itheima.security.distributed.uua.dao"})
public class UAAServer {
    public static void main(String[] args) {
        SpringApplication.run(UAAServer.class, args);
    }
}
