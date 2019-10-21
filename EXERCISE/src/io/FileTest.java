package io;

import java.io.File;
import java.io.IOException;

/**
 * @description: 文件操作
 * @author: YF.Mao
 * @create: 2018/12/2
 **/
public class FileTest {
    public static void main(String[] args) {
        //String abDirPath = "C:\\IO\\File";
        //File abDirFile = new File(abDirPath);
        //if (abDirFile.mkdirs()) {
        //    System.out.println("绝对路径 " + abDirPath + " 创建文件夹成功！");
        //} else {
        //    System.out.println("绝对路径 " + abDirPath + " 创建文件夹失败！");
        //}
        //
        //String dirPath = "IO\\File";
        //File dirFile = new File(dirPath);
        //if (dirFile.mkdirs()) {
        //    System.out.println("相对路径 " + dirPath + " 创建文件夹成功！");
        //} else {
        //    System.out.println("相对路径 " + dirPath + " 创建文件夹失败！");
        //}
        //
        //File file = new File("IO\\File2\\file2");
        //
        //try {
        //    file.isDirectory();
        //    file.createNewFile();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
        //
        //System.out.println(abDirFile.getAbsoluteFile());
        String n = "1";
        System.out.println(n.getClass().toString());
    }
}
