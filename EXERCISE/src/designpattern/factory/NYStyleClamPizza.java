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
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza(String name, Dough dough, Sauce sauce, ArrayList toppings) {
        super(name, dough, sauce, toppings);
    }

    public NYStyleClamPizza() {
        //super("NY Style Sauce and Clam Pizza", "Thin Crust Dough", "Marinara Sauce",
        //        new ArrayList<String>() {
        //            {
        //                add("Sharedded Mozzarella Cheese");
        //            }
        //        });
        super("NY Style Sauce and Clam Pizza", new Dough(), new Sauce(),
                new ArrayList<String>() {
                    {
                        add("Sharedded Mozzarella Cheese");
                    }
                });
    }

    public NYStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }
}
