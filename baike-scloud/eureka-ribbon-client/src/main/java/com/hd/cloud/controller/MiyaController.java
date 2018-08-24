package com.hd.cloud.controller;

import com.hd.cloud.model.ConfigBean;
import com.hd.cloud.model.User;
import com.hd.cloud.model.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableConfigurationProperties({ConfigBean.class, User.class, User2.class})
public class MiyaController {

    @Autowired
    ConfigBean configBean;

    @Autowired
    User user;

    @Autowired
    User2 user2;

    /**
     * 使用javabean
     *
     * @return
     */
    @RequestMapping(value = "/show")
    public String show() {
        return configBean.toString();
    }


    /**
     * 自定义配置文件
     *
     * @return
     */
    @RequestMapping(value = "/user")
    public String user() {
        return user.toString();
    }

    /**
     * 多环境配置文件
     *
     * @return
     */
    @RequestMapping(value = "/user2")
    public String user2() {
        return user2.toString();
    }
}