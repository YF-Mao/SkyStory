package designpattern.factory;

/**
 * @description: 工厂方法具体实现方式
 * @author: YF.Mao
 * @create: 2019/2/19
 **/
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
