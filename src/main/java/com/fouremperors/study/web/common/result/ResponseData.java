package com.fouremperors.study.web.common.result;

import com.fouremperors.study.web.common.result.v1.CommonStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 用于controller层返回json数据时,统一格式
 * <ul>
 * <li>提供统一的状态码</li>
 * <li>统计一分页格式</li>
 * <li>一些接口通用的参数,如服务器时间</li>
 * </ul>
 */
public class ResponseData extends HashMap {

    private static final long serialVersionUID = 1L;
    private static  final  String STATUS_CODE="statusCode";
    private static  final  String STATUS_MSG="statusMsg";
    private static  final  String NOWTIME="nowTime";


    /**
     * 设置响应状态
     * @param status 状态对象
     * @return 当前实例
     */
    public  ResponseData setStatus(ResponseStatus status){
        super.put(STATUS_CODE,status.getCode());
        super.put(STATUS_MSG,status.getMsg());
        return  this;
    }

    /**
     * 添加分页数据，调整为文档通用的解析格式
     * @param page  分页数据对象
     * @return 实例本身
     */
    @SuppressWarnings("rawtypes")
    public ResponseData parsePageBean(Object page){
        super.put("totalRecords",0);
        super.put("totalDisplayRecords", 0);
        super.put("listData", page==null?new ArrayList():page);
        return this;
    }

    public static void main(String[] args) {


        Map<Integer, ResponseStatus> statusMap =

                CommonStatus.statusMap;

        Map<Integer, ResponseStatus> m2=com.fouremperors.study.web.common.result.v0.CommonStatus.status.statusMap;

        ResponseStatus statusByCode = ResponseStatus.getStatusByCode(1);

        int i=0;
    }
}
