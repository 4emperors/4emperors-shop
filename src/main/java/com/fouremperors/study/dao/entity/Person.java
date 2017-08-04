package com.fouremperors.study.dao.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.annotation.Generated;

@RedisHash
public class Person {

    @Id
    String id;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Indexed
    String date;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Indexed
    String realName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}