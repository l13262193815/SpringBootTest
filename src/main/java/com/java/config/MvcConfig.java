package com.java.config;

import com.java.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置拦截器
 */
@Component
public class MvcConfig implements WebMvcConfigurer {
    @Bean
    public LoginInterceptor getLoginInterceptor(){
        //返回拦截器对象
        return new LoginInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        //noinspection SpringConfigurationProxyMethods
        registry.addInterceptor(getLoginInterceptor()).addPathPatterns("/**");
    }
}
