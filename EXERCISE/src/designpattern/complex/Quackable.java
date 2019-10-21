package designpattern.complex;

/**
 * @description: 委托给Observable这个类来完成
 * @author: YF.Mao
 * @create: 2019/3/12
 **/
public abstract class Quackable implements QuackObservable{
    Observable observable;

    public Quackable() {
        observable = new Observable(this);
    }

    public abstract void quack();

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
