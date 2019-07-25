package com.tml.demo.feignclient.controller;

import com.tml.demo.feignclient.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping(method = RequestMethod.GET)
    public String hello(String name) {
        return demoService.hello(name);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String hello2(MultipartFile file) {
        return demoService.hello2(file);
    }
}
