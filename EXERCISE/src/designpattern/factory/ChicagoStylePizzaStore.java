package designpattern.factory;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/2/19
 **/
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type == "cheese") {
            pizza = new ChicagoStyleCheesePizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
}
