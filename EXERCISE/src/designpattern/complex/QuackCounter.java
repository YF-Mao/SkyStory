package designpattern.complex;

/**
 * @description: 装饰器
 * @author: YF.Mao
 * @create: 2019/3/12
 **/
public class QuackCounter extends Quackable{
    private Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable quackable) {
        this.duck = quackable;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks ++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
