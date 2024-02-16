package com.duanli.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * 1.controller
 * 2.handlerMapping handlerAdapter
 * 3.全局异常处理器
 * 4.静态资源处理: configureDefaultServletHandling
 * 5.jsp 视图解析器前后缀: configureViewResolvers
 * 6.json转换器
 * 7.拦截器
 *
 * */

@Configuration
@EnableWebMvc
@ComponentScan("com.duanli.controller")
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
