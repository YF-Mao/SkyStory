package designpattern.template;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/1/27
 **/
public class MoneyMarketAccount extends AbstractAccount{
    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
