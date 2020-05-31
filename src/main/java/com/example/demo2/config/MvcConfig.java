package com.example.demo2.config;

import com.example.demo2.component.MyLocaleResolver;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName MvcConfig
 * @Description
 * @Author linjunjin
 * @Date 2020/5/20 20:59
 **/
//WebMvcConfigurerAdapter过时，使用
@Configuration
public class MvcConfig implements WebMvcConfigurer {
   /* public void test(){
    //        点进去查看配置信息
        MessageSourceAutoConfiguration m;//查看basename
        WebMvcAutoConfiguration w;//查看LocaleResolver
    }*/

    //拦截请求，将请求直接导向页面方式一，实现addViewControllers（）方法
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {
        viewControllerRegistry.addViewController("index").setViewName("index");
    }

    //拦截请求，将请求直接导向页面方式二，自定义Configurer
    @Bean//所有的webConfigurer都会在启动时生效，通过往容器添加自定的config达到过滤的目的
    public WebMvcConfigurer WebMvcConfigurer() {
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                //registry.addViewController("/").setViewName("login");
            }

        };
        return webMvcConfigurer;
    }

    @Bean//注意此处方法名要一致，找了挺久
    public LocaleResolver localeResolver() {
        return  new MyLocaleResolver();
    }
}
