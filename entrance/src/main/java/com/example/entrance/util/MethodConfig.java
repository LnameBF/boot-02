package com.example.entrance.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

//@Configuration(proxyBeanMethods = false)
public class MethodConfig {


    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        HiddenHttpMethodFilter hidden = new HiddenHttpMethodFilter();
        hidden.setMethodParam("_m");
        return hidden;
    }
}
