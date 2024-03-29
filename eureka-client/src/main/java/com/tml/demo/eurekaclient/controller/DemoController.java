package com.tml.demo.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    @Value("${server.port}")
    private int port;

    @RequestMapping(method = RequestMethod.GET)
    public String hello(String name) {
        return "hello " + name +", this is "+port;
    }


    @RequestMapping(method = RequestMethod.POST)
    public String hello2(MultipartFile file) {
        StringBuilder sb = new StringBuilder();
        sb.append("this is ")
                .append(port)
                .append(" file size is ")
                .append(file.getSize());
        return sb.toString();
    }
}
