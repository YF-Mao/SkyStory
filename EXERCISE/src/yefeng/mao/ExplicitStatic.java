package yefeng.mao;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/5/16
 **/
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
        BigDecimal bigDecimal = new BigDecimal("1200000");
        DecimalFormat decimalFormat = new DecimalFormat();
    }

    //static Cups cups = new Cups();
}

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}


class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}