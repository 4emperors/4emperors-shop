package com.fouremperors.study.dao.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

/**
 * Created by qianfanyanfa on 16/6/4.
 */
@RedisHash("products")
public class Product {

    @Id
    String id;

    String name;

    int price;

    @Indexed
    String date;

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    boolean isMeat;

    Product(String name, Boolean isMeat, int price) {
        this.name = name;
        this.isMeat = isMeat;
        this.price = price;
    }
}
