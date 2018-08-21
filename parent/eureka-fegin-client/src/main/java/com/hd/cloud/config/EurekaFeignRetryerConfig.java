package com.hd.cloud.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/8/21.
 */
@Configuration
public class EurekaFeignRetryerConfig {

    /**
     * 重试机制
     * <p>
     * 重试间隔 100毫秒  最大重试间隔 1秒  重试次数
     *
     * @return
     */
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 5);
    }
}
