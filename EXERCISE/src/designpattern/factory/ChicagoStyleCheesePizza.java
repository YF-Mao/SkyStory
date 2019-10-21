package designpattern.factory;

import designpattern.abstractfactory.Dough;
import designpattern.abstractfactory.PizzaIngredientFactory;
import designpattern.abstractfactory.Sauce;

import java.util.ArrayList;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/2/19
 **/
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(String name, Dough dough, Sauce sauce, ArrayList toppings) {
        super(name, dough, sauce, toppings);
    }

    public ChicagoStyleCheesePizza() {
        //super("Chicago Style Sauce and Cheese Pizza", "Thin Crust Dough", "Marinara Sauce",
        //        new ArrayList<String>() {
        //            {
        //                add("Grated Reggiano Cheese");
        //            }
        //        });
        super("Chicago Style Sauce and Cheese Pizza", new Dough(), new Sauce(),
                new ArrayList<String>() {
                    {
                        add("Grated Reggiano Cheese");
                    }
                });
    }

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }
}
