package com.ggg.springCloud.dao;

import com.ggg.springcloud.entities.PayMent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayMentDao {
    public int create(PayMent payMent);

    public PayMent getPayMentById(@Param("id")Long id);
}
