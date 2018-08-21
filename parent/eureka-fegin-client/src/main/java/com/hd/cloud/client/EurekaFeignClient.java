package com.hd.cloud.client;

import com.hd.cloud.config.EurekaFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/8/21.
 */
@FeignClient(value = "eureka-client", configuration = EurekaFeignConfig.class)
public interface EurekaFeignClient {

    @GetMapping(value = "hi")
    String hi(@RequestParam(value = "name", defaultValue = "hhdong") String name);
}
