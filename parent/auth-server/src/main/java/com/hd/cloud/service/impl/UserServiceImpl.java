package com.hd.cloud.service.impl;

import com.hd.cloud.model.CustomUserDetails;
import com.hd.cloud.model.User;
import com.hd.cloud.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        /*模拟数据库操作*/
        User user = new User();
        user.setUsername("10086");
        user.setPassword("123456");
        return new CustomUserDetails(user);
    }

}