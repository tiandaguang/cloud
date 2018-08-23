package com.hd.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class AuthServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(AuthServer2Application.class, args);
    }
}
