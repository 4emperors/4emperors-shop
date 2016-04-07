package com.fouremperors.study.domain;

/**
 * Created by qianfanyanfa on 16/4/7.
 */
public class UserAuth {

    private Long id;
    private Long uid;
    //密码对应的类型
    private Integer type;
    //加密的盐值
    private String salt;
    //加密后的密码
    private String password;
    //加密方式
    private String mode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
