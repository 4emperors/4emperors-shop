package com.fouremperors.study.web.common.result.v0;

import com.fouremperors.study.web.common.result.ResponseStatus;

/**
 * Created by qianfanyanfa on 16/6/1.
 */
public  class BaseResponseStatus implements ResponseStatus {

    private int code;
    private String msg;

    public BaseResponseStatus() {
        this.code = Integer.MAX_VALUE;
        this.msg = "标识";
    }
    public BaseResponseStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.registStatus(this);
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
