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
public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza(String name, Dough dough, Sauce sauce, ArrayList toppings) {
        super(name, dough, sauce, toppings);
    }

    public ChicagoStyleClamPizza() {
        //super("Chicago Style Sauce and Clam Pizza", "Thin Crust Dough", "Marinara Sauce",
        //        new ArrayList<String>() {
        //            {
        //                add("Grated Reggiano Cheese");
        //            }
        //        });
        super("Chicago Style Sauce and Clam Pizza", new Dough(), new Sauce(),
                new ArrayList<String>() {
                    {
                        add("Grated Reggiano Cheese");
                    }
                });
    }

    public ChicagoStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }
}
