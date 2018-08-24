package com.hd.cloud.config;

import com.hd.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.ws.rs.HttpMethod;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {


    private final UserService userService;

    @Autowired
    public WebSecurityConfiguration(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }

    class HelloWebSecurityConfiguration extends WebSecurityConfigurerAdapter {

        /**
         * 解决AuthorizationServerConfiguration 中 不能注入AuthenticationManager
         *
         * @return
         * @throws Exception
         */
        @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
        @Override
        public AuthenticationManager authenticationManagerBean() throws Exception {
            return super.authenticationManagerBean();
        }

        /**
         * 解决跨域
         *
         * @param http
         * @throws Exception
         */
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.requestMatchers().antMatchers(HttpMethod.OPTIONS, "/oauth/token", "/rest/**", "/api/**", "/**")
                    .and()
                    .csrf().disable();
        }
    }
}