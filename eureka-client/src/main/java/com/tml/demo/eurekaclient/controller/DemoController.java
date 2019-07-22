package com.tml.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(String name) {
        return "hello " + name;
    }
}
