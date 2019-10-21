package designpattern.abstractfactory;

/**
 * @description: 抽象工厂方法，Pizza的原料工厂
 * @author: YF.Mao
 * @create: 2019/2/20
 **/
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSaugh();
    public Clams createClams();
}
