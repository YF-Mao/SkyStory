package designpattern.decorator;

import designpattern.template.AbstractAccount;
import designpattern.template.MoneyMarketAccount;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/6
 **/
public class DecoratorTest {
    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(cc);
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);

        decoratorA.operation();
        decoratorB.operation();

    }
}
