package designpattern.template;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/1/27
 **/
public class CDAccount extends AbstractAccount{
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
