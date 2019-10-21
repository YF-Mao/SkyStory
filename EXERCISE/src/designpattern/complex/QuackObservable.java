package designpattern.complex;

/**
 * @description: 观察者模式-主题接口
 * 主要职责：提醒主题类内的观察者更新内容
 * @author: YF.Mao
 * @create: 2019/3/13
 **/
public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
