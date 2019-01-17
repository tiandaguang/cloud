package com.hd.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaProApplication {

    @Value("${server.port}")
    String port;

//    @Bean
//    public Sampler defaultSampler() {
//        return Sampler.ALWAYS_SAMPLE;
//    }

    @RequestMapping("/hi")
    public String home(@RequestParam(defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaProApplication.class, args);
    }
}
