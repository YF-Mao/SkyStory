package callback;

/**
 * @description: java中的回调函数，开放了一个接口，通过多态在运行时调用
 * 自己写的内容
 * @author: YF.Mao
 * @create: 2019/1/31
 **/
public class Caller {
    private MyCallInterface callInterface;

    public Caller() {

    }

    public Caller(MyCallInterface callInterface) {
        this.callInterface = callInterface;
    }

    public void setCallFunc(MyCallInterface callInterface) {
        this.callInterface = callInterface;
    }

    public void call() {
        callInterface.printName();
    }
}
