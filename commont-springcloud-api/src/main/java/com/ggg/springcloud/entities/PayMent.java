package com.ggg.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayMent implements Serializable {
    private static final Long SerializableId=223L;

    private Long id;

    private String serial;
}
