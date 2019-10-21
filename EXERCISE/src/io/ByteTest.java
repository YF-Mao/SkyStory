package io;

import java.io.FilterInputStream;
import java.math.BigDecimal;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/2
 **/
public class ByteTest {

    public static void main(String[] args) {
        String str1 = "测试ceshi";

        byte[] bytes = str1.getBytes();

        System.out.println(bytes.length);
        for (byte b : bytes) {
            System.out.println(b);
        }

        System.out.println(2 << 12);
        BigDecimal bb = new BigDecimal("20745884208");
        System.out.println(bb.toString());
        System.out.println();
        System.out.println((bb.divide(new BigDecimal("1024"), 4, BigDecimal.ROUND_HALF_UP)
        .divide(new BigDecimal("1000000"), 4, BigDecimal.ROUND_HALF_UP)));
    }
}
