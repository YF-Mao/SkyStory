package designpattern.observer;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/6/28
 **/
public interface WflLifecycle {
    void addWflLifecycleListener(WflLifecycleListener listener);

    void removeLifecycleListener(WflLifecycleListener listener);
}
