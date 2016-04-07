package com.fouremperors.study.domain;

/**
 * Created by qianfanyanfa on 16/4/7.
 */
public class UserLoginName {

    private Long id;

    private Long uid;

    private String loginName;
    //用户名类型,如 手机,邮箱,第方等
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
