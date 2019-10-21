package designpattern.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/6/28
 **/
public abstract class BaseWflLifecycle implements WflLifecycle {
    private List<WflLifecycleListener> wflLifecycleListeners = new CopyOnWriteArrayList<>();

    @Override
    public void addWflLifecycleListener(WflLifecycleListener listener) {
        wflLifecycleListeners.add(listener);
    }

    @Override
    public void removeLifecycleListener(WflLifecycleListener listener) {
        wflLifecycleListeners.remove(listener);
    }

    protected void fireLifecycle() {
        WflLifecycleEvent wflLifecycleEvent = new WflLifecycleEvent();
        for (WflLifecycleListener listener : wflLifecycleListeners) {
            listener.wflLifecycleEvent(wflLifecycleEvent);
        }
    }

    protected void notifyListener(String data) {
        for (WflLifecycleListener listener : wflLifecycleListeners) {
            listener.update(data);
        }
    }
}
