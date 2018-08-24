package com.hd.cloud.client;

import com.hd.cloud.config.EurekaFeignRetryerConfig;
import com.hd.cloud.config.EurekaHystrixConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/8/21.
 *
 * Feign客户端
 */
@FeignClient(value = "eureka-client", configuration = EurekaFeignRetryerConfig.class, fallback = EurekaHystrixConfig.class)
public interface EurekaFeignClient {

    @GetMapping(value = "hi")
    String hi(@RequestParam(value = "name", defaultValue = "hhdong") String name);
}
