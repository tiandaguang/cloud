package com.hd.cloud.service;

import com.hd.cloud.client.EurekaFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/8/21.
 */
@Service
public class EurekaFeignService {
    @Autowired
    EurekaFeignClient eurekaFeignClient;

    public String hi(String name) {
        return eurekaFeignClient.hi(name);
    }

}
