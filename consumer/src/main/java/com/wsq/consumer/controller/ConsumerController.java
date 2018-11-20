package com.wsq.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wsq.api.IProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference
    private IProvider iProvider;

    @RequestMapping("consumer")
    public String consumer(){
        return iProvider.provide();
    }
}
