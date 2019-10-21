package designpattern.order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/2/26
 **/
public class NoCommond implements InvocationHandler{

    public void execute() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
