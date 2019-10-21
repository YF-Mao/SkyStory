package designpattern.template;

import designpattern.factory.NYPizzaStore;
import designpattern.factory.PizzaStore;

import java.awt.event.ActionListener;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/1/27
 **/
public class TemplateTest {
    public static void main(String[] args) {
        AbstractAccount account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }
}
