package designpattern.decorator;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/6
 **/
public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        BFunction();
    }

    private void BFunction() {
        System.out.println("扩展了功能，B独有的方法");
    }
}
