package com.fouremperors.study.dao.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.Date;
import java.util.List;

/**
 * Created by qianfanyanfa on 16/6/4.
 */
@RedisHash("orders")
public class OrderInfo {

    @Id
    String id;
    @Indexed
    Date date;


}
