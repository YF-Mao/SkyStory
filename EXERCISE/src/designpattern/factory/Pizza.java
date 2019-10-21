package designpattern.factory;

import designpattern.abstractfactory.Clams;
import designpattern.abstractfactory.Dough;
import designpattern.abstractfactory.PizzaIngredientFactory;
import designpattern.abstractfactory.Sauce;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/2/19
 **/
public abstract class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Clams clams;
    ArrayList toppings = new ArrayList();

    PizzaIngredientFactory pizzaIngredientFactory = null;

    public Pizza(String name, Dough dough, Sauce sauce, ArrayList toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings.add(toppings);
    }

    public Pizza() {
        this.name = "null";
        this.dough = null;
        this.sauce = null;
    }

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        this.sauce = pizzaIngredientFactory.createSaugh();
        this.clams = pizzaIngredientFactory.createClams();
    }

    public void prepare() {
        if (Objects.isNull(pizzaIngredientFactory)) {
            System.out.println("Preparing " + this.name);
            System.out.println("Tossing dough...");
            System.out.println("Adding sauce...");
            System.out.println("Adding toppings: ");
            for (int i = 0; i < toppings.size(); i++) {
                System.out.println("  " + toppings.get(i));
            }
        } else {
            System.out.println("Preparing " + this.name);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }
}
