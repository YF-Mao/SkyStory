package designpattern.template;

import java.util.Observer;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/1/27
 **/
public abstract class AbstractAccount {
    /**
     * 模板方法，计算利息数额
     *
     */
    public final double calculateInterest() {
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);
        return amount * interestRate;
    }

    protected abstract String doCalculateAccountType();

    protected abstract double doCalculateInterestRate();

    public final double calculateAmount(String accountType) {
        /**
         * 省略相关业务
         *
         */
        return 7234.00;
    }

    public static void main(String[] args) {
        String s = "https://sssss.ss";
        System.out.println(s.replaceAll("https://","tst"));
    }

}
