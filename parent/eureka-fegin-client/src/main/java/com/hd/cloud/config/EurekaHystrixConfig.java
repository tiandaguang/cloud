package com.hd.cloud.config;

import com.hd.cloud.client.EurekaFeignClient;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/8/21.
 * <p>
 * 熔断器业务类
 */
@Component
public class EurekaHystrixConfig implements EurekaFeignClient {

    @Override
    public String hi(String name) {
        return "hi ," + name + ",sorry ,error!";
    }
}
