package designpattern.factory;

import designpattern.abstractfactory.Dough;
import designpattern.abstractfactory.PizzaIngredientFactory;
import designpattern.abstractfactory.Sauce;

import java.util.ArrayList;

/**
 * @description: 具体的Pizza通过继承Pizza顶级抽象类或者接口
 * @author: YF.Mao
 * @create: 2019/2/19
 **/
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(String name, Dough dough, Sauce sauce, ArrayList toppings) {
        super(name, dough, sauce, toppings);
    }

    /**
     * 无参构造方法
     * super为什么必须要放方法开头，保证了父类对象先初始化
     */
    public NYStyleCheesePizza() {
        //super("NY Style Sauce and Cheese Pizza", "Thin Crust Dough", "Marinara Sauce",
        //        new ArrayList<String>() {
        //            {
        //                add("Sharedded Mozzarella Cheese");
        //            }
        //        });
        super("NY Style Sauce and Cheese Pizza", new Dough(), new Sauce(),
                new ArrayList<String>() {
                    {
                        add("Sharedded Mozzarella Cheese");
                    }
                });
        //String name = "NY Style Sauce and Cheese Pizza";
        //String dough = "Thin Crust Dough";
        //String sauce = "Marinara Sauce";
    }

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }
}
