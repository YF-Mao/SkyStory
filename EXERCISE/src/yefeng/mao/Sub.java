package yefeng.mao;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/5/26
 **/
public class Sub extends Super{
    public int field;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }

    public static void main(String[] args) {
        Super su = new Sub();
        System.out.println(su.getField() + "" + su.field);
    }
}
