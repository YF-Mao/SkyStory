package designpattern.observer.observer;

import designpattern.observer.WflLifecycle;
import designpattern.observer.WflLifecycleEvent;
import designpattern.observer.WflLifecycleListener;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/6/28
 **/
public class WflListener implements WflLifecycleListener {
    private String wflLifecycleState;
    private WflLifecycleEvent wflLifecycleEvent;

    @Override
    public void update(String data) {
        this.wflLifecycleState = data;
        System.out.println("我是观察者[" + this.getClass().getName()
                + "],观察到了data：[" + wflLifecycleState + "]");
    }

    @Override
    public void wflLifecycleEvent(WflLifecycleEvent wflEvent) {
        this.wflLifecycleEvent = wflEvent;
        System.out.println("我是观察者[" + this.getClass().getName()
                + "],观察到了wflLifecycleEvent：[" + wflLifecycleEvent + "]");
    }
}
