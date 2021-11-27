package com.ggg.springCloud.service;


import com.ggg.springcloud.entities.PayMent;

public interface PayMentService {

    public int create(PayMent payMent);

    public PayMent getPayMentById(Long id);
}
