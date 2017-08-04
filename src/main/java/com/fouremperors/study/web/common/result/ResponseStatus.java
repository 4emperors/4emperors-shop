package com.fouremperors.study.web.common.result;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 */
public interface ResponseStatus {

  final static Map<Integer, ResponseStatus> statusMap = new HashMap<>();

  /**
   * 响应状态的状态码,如200 表示操作成功
   *
   * @return 一个数字（对应响应码文档）
   */
  int getCode();

  /**
   * 返回状态码对应的文字描述
   *
   * @return
   */
  String getMsg();

  /**
   * 全局注册状态对象
   *
   * @param status
   */
  default void registStatus(ResponseStatus... status) {
    this.getCode();
    statusMap.putAll(Stream.of(status).collect(Collectors.toMap(
    t -> t.getCode(), t1 -> t1)));
  }

  static ResponseStatus getStatusByCode(int code) {
    return statusMap.get(code);
  }
//    default

}
