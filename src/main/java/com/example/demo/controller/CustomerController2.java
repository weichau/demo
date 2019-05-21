package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
public class CustomerController2 {

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String doSomething(@PathParam("id") long id, @PathParam("name") String name, @PathParam("age") int age) {

        Customer customer = new Customer();

        // @Setter / @Getter
        customer.setId(id);
        customer.setName(name);
        customer.setAge(age);

        System.out.println("ID:" + customer.getId());
        System.out.println("Name:" + customer.getName());
        System.out.println("Age:" + customer.getAge());

        // @ToString
        System.out.println("ToString:" + customer.toString());

        // @HashCode
        System.out.println("HashCode:" + customer.hashCode());

        return customer.toString();
    }

}
