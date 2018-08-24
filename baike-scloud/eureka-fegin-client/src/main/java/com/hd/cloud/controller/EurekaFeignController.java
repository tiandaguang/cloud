package com.hd.cloud.controller;

import com.hd.cloud.service.EurekaFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/8/21.
 */
@RestController
public class EurekaFeignController {
    @Autowired
    EurekaFeignService eurekaFeignService;

    @GetMapping(value = "hi")
    public String hi(@RequestParam(defaultValue = "hd", required = false) String name) {
        name = name.concat("_from EurekaFeignController ");
        return eurekaFeignService.hi(name);
    }

}
