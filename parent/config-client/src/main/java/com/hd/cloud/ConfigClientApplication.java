package com.hd.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * 从本地读取配置文件
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
