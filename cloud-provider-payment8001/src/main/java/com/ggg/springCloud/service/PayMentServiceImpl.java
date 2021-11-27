package com.ggg.springCloud.service;

import com.ggg.springCloud.dao.PayMentDao;
import com.ggg.springcloud.entities.PayMent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PayMentServiceImpl implements PayMentService {

    @Autowired
    private PayMentDao payMentDao;

    @Override
    public int create(PayMent payMent) {
        System.out.println("*****"+payMent.getSerial());
        return (int) payMentDao.create(payMent);
    }

    @Override
    public PayMent getPayMentById(Long id) {
        return payMentDao.getPayMentById(id);
    }
}
