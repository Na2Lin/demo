package com.tml.demo.feignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "eureka-client")
public interface DemoService {
    @RequestMapping(value = "demo",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);


    @RequestMapping(value = "demo",method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String hello2(@RequestPart("file") MultipartFile file);
}
