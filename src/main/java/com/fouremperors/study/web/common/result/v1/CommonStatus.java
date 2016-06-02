package com.fouremperors.study.web.common.result.v1;

import com.fouremperors.study.web.common.result.ResponseStatus;

/**
 * Created by qianfanyanfa on 16/6/1.
 */
public enum CommonStatus implements ResponseStatus {

    SUCCESS(1, "OK"),

    ERROR(11111, "服务器忙");

    static {
        CommonStatus.SUCCESS.registStatus(CommonStatus.values());
    }

    int code;
    String msg;

    CommonStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
//        this.registStatus(this);
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
