package yefeng.mao;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/5/7
 **/
public class Test {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println("======================");
        System.out.println(System.getProperty("user.name"));
        System.out.println("=====================");
        System.out.println(System.getProperty("java.library.path"));


    }
}
