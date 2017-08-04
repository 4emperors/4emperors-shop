package com.fouremperors.study;

import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by qianfanyanfa on 2017/7/5.
 */
public class StringUtilsTest {

  @Test
  public void test() {
    ArrayList<String> strings = Lists.newArrayList("1", "12");
    String join = StringUtils.join(strings.iterator(), ",");
    System.out.println(join);
  }
}
