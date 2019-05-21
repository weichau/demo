package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Value("${com.example.name}")
	private String name;

    @Value("${com.example.want}")
    private String want;
    
    @Value("${com.example.sentence}")
    private String sentence;
    
    @Value("${com.example.my.age}")
    private String age;

    @Value("${com.example.my.gender}")
    private String gender;

    @Value("${spring.jpa.database-platform}")
    private String database;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return name + "," + want + "," + database;
    }
    
    @RequestMapping(value = "/sentence", method = RequestMethod.GET)
    public String sentence() {
        return sentence;
    }
	    
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo(){
        return "Hello World!";
    }
    
    @RequestMapping(value = "/my", method = RequestMethod.GET)
    public String myProperties() {
        return "性別：" + gender + ",今年" + age;
    }
    
}
