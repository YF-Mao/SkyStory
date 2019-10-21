package designpattern.abstractfactory;

/**
 * @description: 抽象工厂的具体实现方法
 * @author: YF.Mao
 * @create: 2019/2/20
 **/
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSaugh() {
        return new Sauce();
    }

    @Override
    public Clams createClams() {
        return new Clams();
    }
}
