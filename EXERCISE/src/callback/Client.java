package callback;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/1/31
 **/
public class Client implements MyCallInterface{
    @Override
    public void printName() {
        System.out.println("B写的程序需要被回调部分");
    }

    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.setCallFunc(new Client());
        caller.call();

        System.out.println("--------------------");
        Caller caller1 = new Caller();
        caller1.setCallFunc(() -> {
            System.out.println("自定义需要被回调部分");
        });
        caller1.call();
    }
}
