package com.fouremperors.study;


import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by qianfanyanfa on 16/5/13.
 */
public class TestUtil {

    static String[] firstName = "赵,钱,孙,李,周,吴,郑,王,冯,陈,褚,卫,蒋,沈,韩,杨,朱,秦,尤,许,何,吕,施,张,孔,曹,严,华,金,魏,陶,姜,戚,谢,邹,喻,柏,水,窦,章,云,苏,潘,葛,奚,范,彭".split(",");

    public static String generateChineseName() {


        String s = firstName[new Random().nextInt(firstName.length)] + getChinese();

        return s;
    }

    /**
     * 返回指定任意长度的用户名字
     *
     * @param length
     * @return
     */
    public static Optional<String> generateUserName(int length) {

        String base = "abcdefghijklmnopqrstuvwxyz0123456789";

        return Stream.generate(() -> String.valueOf(base.charAt(new Random().nextInt(base.length())))).limit(length).reduce((x, y) -> {
            return x + y;
        });
    }
    public static Optional<String> generateNum(int length) {

        return Stream.generate(() -> String.valueOf(new Random().nextInt(10))).limit(length).reduce((x, y) -> {
            return x + y;
        });
    }
    public static void main(String[] args) throws Exception {
        System.out.println(generateNum(18));
        System.out.println(generateChineseName());
    }

    public static String getChinese() {
        String str = null;
        int highPos, lowPos;
        long seed = new Date().getTime();
        Random random = new Random(seed);
        highPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = 161 + Math.abs(random.nextInt(93));
        byte[] b = new byte[2];
        b[0] = (new Integer(highPos)).byteValue();
        b[1] = (new Integer(lowPos)).byteValue();
        try {
            str = new String(b, "GBK");
        } catch (UnsupportedEncodingException e) {
            str="壮";
        }
        System.out.println(str);
        return str;
    }

}
