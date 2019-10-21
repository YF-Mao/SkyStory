package designpattern.decorator;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2018/12/6
 **/
public abstract class Decorator extends Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
