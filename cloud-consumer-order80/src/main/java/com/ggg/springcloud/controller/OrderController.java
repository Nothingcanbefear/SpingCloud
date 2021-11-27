package com.ggg.springcloud.controller;

import com.ggg.springcloud.entities.CommonResult;
import com.ggg.springcloud.entities.PayMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private static final String PAY_URL="http://localhost:8002/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<PayMent> create(@RequestBody PayMent payMent){
        return restTemplate.postForObject(PAY_URL+"payment/create",payMent,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<PayMent> getPayMentById(@PathVariable("id")Long id){
        return restTemplate.getForObject(PAY_URL+"payment/get/"+id,CommonResult.class);
    }

}
