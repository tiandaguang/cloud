package com.hd.cloud.controller;

import com.hd.cloud.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {


    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    RibbonService ribbonService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(required = false, defaultValue = "tianda") String name) {
        name = name.concat("_from RibbonController  ");
        return ribbonService.sayHiFromClientOne(name);
    }
}