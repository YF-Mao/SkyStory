package designpattern.decorator;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/6
 **/
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        AFunction();
    }

    private void AFunction() {
        System.out.println("扩展了功能，A独有的方法");
    }

}
