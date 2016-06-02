package com.fouremperors.study.web.common.result.v0;

import com.fouremperors.study.web.common.result.ResponseStatus;

/**
 * Created by qianfanyanfa on 16/6/1.
 */
public class CommonStatus extends BaseResponseStatus {

    public static CommonStatus status = new CommonStatus();

    public ResponseStatus SUCCESS = new BaseResponseStatus(1, "OK");

    public ResponseStatus ERROR = new BaseResponseStatus(11111, "服务器忙");


}
