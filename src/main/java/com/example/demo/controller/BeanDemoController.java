package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.ConfigBean;

@RestController
public class BeanDemoController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/bean", method = RequestMethod.GET)
    public String beanConfig() {
        return configBean.getName() + "," + configBean.getWant();
    }
    
    @RequestMapping(value = "/bean/sentence", method = RequestMethod.GET)
    public String beanSentenceConfig() {
        return configBean.getSentence();
    }

}
