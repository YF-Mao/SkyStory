package designpattern.factory;

import designpattern.abstractfactory.NYPizzaIngredientFactory;
import designpattern.abstractfactory.PizzaIngredientFactory;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/2/19
 **/
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type == "cheese") {
            pizza = new NYStyleCheesePizza();
        } else if (type == "NYcheese") {
            pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
        } else {
            pizza = null;
        }
        return pizza;
    }
}
