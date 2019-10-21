package designpattern.abstractfactory;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/2/20
 **/
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSaugh() {
        return new Sauce();
    }

    @Override
    public Clams createClams() {
        return new Clams();
    }
}
