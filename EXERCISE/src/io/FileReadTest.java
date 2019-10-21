package io;

import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 文件内容读取测试 190430
 * @author: YF.Mao
 * @create: 2019/4/30
 **/
public class FileReadTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\YF.Mao\\Desktop\\日常系.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

        StringBuffer stringBuffer = new StringBuffer();
        long start = System.currentTimeMillis();
        byte[] b = new byte[1024 * 8];
        int len;
        while ((len = bis.read(b)) != -1) {
            stringBuffer.append(new String(b, 0, len, "UTF-8"));
        }
        bis.close();

        System.out.println("输出内容：" + stringBuffer);

        long end = System.currentTimeMillis();
        System.out.println(end + " " + start);
    }
}
