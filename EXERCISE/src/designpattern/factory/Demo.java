package designpattern.factory;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/2/19
 **/
public class Demo {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
        System.out.println("------------------");
        pizzaStore.orderPizza("NYcheese");
    }
}
