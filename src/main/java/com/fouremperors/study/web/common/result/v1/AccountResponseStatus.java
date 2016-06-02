package com.fouremperors.study.web.common.result.v1;

import com.fouremperors.study.web.common.result.ResponseStatus;

/**
 * Created by qianfanyanfa on 16/6/1.
 */
public enum AccountResponseStatus implements ResponseStatus {

    SHOP_MARGIN(10503,"商家保证金余额不足");

    int code;

    String msg;

    AccountResponseStatus(int code,String msg){
        this.code=code;
        this.msg=msg;
        registStatus(this);
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
