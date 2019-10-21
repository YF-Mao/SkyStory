package designpattern.observer;

/**
 * @description: 观察者模式又分为推模型和拉模型，区别在于传递给观察者的时候信息量的多少，
 * 拉模型可以传递整个主题对象给观察者
 * @author: YF.Mao
 * @create: 2019/6/28
 **/
public interface WflLifecycleListener {
    void update(String data);

    void wflLifecycleEvent(WflLifecycleEvent wflEvent);
}
