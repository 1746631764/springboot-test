package com.example.demo2.component;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @ClassName MyLocaleResolver
 * @Description
 * @Author linjunjin
 * @Date 2020/5/21 9:10
 **/
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {

        //获取语言信息
       // String language=httpServletRequest.getParameter("l");
        String language="zh_CN";
        Locale locale=null;
        if(!StringUtils.isEmpty(language)){
            String[] split=language.split("_");
           locale = new Locale(split[0], split[1]);
        }
        return locale;//要生效，需要放到容器中
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
