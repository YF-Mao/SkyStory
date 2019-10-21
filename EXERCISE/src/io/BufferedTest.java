package io;

import java.io.*;
import java.math.BigDecimal;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/3
 **/
public class BufferedTest {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("IO\\File\\1ss.jpg");

        String copyPath = "IO\\FileCopy\\1ss.jpg";
        File copyFile = new File(copyPath);
        if (!copyFile.exists()) {
            copyFile.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(copyFile);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

//        int b;
//        while ((b = bis.read()) != -1) {
//            bos.write(b);
//        }
        long start = System.currentTimeMillis();
        byte[] b = new byte[1024 * 8];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        bis.close();
        bos.close();

        long end = System.currentTimeMillis();
        System.out.println(end + " " + start);


    }
}
