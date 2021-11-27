package com.ggg.springCloud.controller;

import com.ggg.springCloud.service.PayMentServiceImpl;
import com.ggg.springcloud.entities.CommonResult;
import com.ggg.springcloud.entities.PayMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class PaymentController {

    @Autowired
    private PayMentServiceImpl payMentService;


    @PostMapping(value = "/payment/create")
    private CommonResult<PayMent> create(@RequestBody PayMent payMent){
        int i = payMentService.create(payMent);

        if(i>0){
            return new CommonResult(200,"SUCESS",i);
        }else {
            return new CommonResult(444,"FAILURE");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    private CommonResult<PayMent> getPayMentById(@PathVariable("id") Long id){
        PayMent payMent = payMentService.getPayMentById(id);

        if(payMent !=null){
            return new CommonResult(200,"SUCESS",payMent);
        }else {
            return new CommonResult(444,"FAILURE");
        }
    }
}
