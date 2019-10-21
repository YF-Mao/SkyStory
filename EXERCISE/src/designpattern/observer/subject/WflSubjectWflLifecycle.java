package designpattern.observer.subject;

import designpattern.observer.BaseWflLifecycle;
import designpattern.observer.WflLifecycleListener;
import designpattern.observer.observer.WflListener;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/6/28
 **/
public class WflSubjectWflLifecycle extends BaseWflLifecycle {
    private String state;

    public void change(String data) {
        this.state = data;
        notifyListener(data);
    }

    public static void main(String[] args) {
        WflSubjectWflLifecycle wflSubjectWflLifecycle = new WflSubjectWflLifecycle();

        WflLifecycleListener listener = new WflListener();

        wflSubjectWflLifecycle.addWflLifecycleListener(listener);

        wflSubjectWflLifecycle.change("NEW");
    }
}
