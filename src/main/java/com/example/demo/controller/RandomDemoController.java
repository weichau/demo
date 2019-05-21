package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomDemoController {

    @Value("${com.example.secret}")
    private String secret;

    @Value("${com.example.number}")
    private Integer number;

    @Value("${com.example.bignumber}")
    private Long bignumber;

    @Value("${com.example.uuid}")
    private String uuid;

    @Value("${com.example.number.less.than.ten}")
    private Integer lessThanTen;

    @Value("${com.example.number.int.range}")
    private Integer range;

    @RequestMapping(value = "/random", method = RequestMethod.GET)
    public String random() {
        StringBuffer sb = new StringBuffer();
        sb.append("secret:").append(secret).append("|");
        sb.append("number:").append(number).append("|");
        sb.append("bignumber:").append(bignumber).append("|");
        sb.append("uuid:").append(uuid).append("|");
        sb.append("lessThanTen:").append(lessThanTen).append("|");
        sb.append("range:").append(range);
        return sb.toString();
    }

}
