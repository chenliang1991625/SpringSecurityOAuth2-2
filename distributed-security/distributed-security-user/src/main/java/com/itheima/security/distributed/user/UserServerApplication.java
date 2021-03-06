package com.itheima.security.distributed.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import tk.mybatis.spring.annotation.MapperScan;
/**
 * @author Administrator
 * @version 1.0
 **/
@SpringBootApplication(scanBasePackages = {"com.itheima.security.distributed"})//要扫描到distribute-commons和distributed.configuration-feign中的组件
@EnableDiscoveryClient
@EnableHystrix
//@EnableFeignClients(basePackages = {"com.itheima.security.distributed.feign"})
@EnableAuthorizationServer//要加,不然没权限,因为引入了spring-security Autho2的依赖
@MapperScan(basePackages = {"com.itheima.security.distributed.user.dao"})
@EnableEurekaClient
public class UserServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServerApplication.class, args);
    }
}
