package designpattern.template;

/**
 * @description: 模板模式。
 * 抽象模板定义：
 * 1.定义并实现了一个模板方法
 * 2.定义了一个或多个抽象操作
 * @author: YF.Mao
 * @create: 2019/1/27
 **/
public abstract class AbstractTemplate {
    /**
     * 模板方法
     * 
     */
    public void templateMethod() {
        abstractMethod();
        hookMethod();
        concreteMethod();
    }
    
    /**
     * 基本方法的声明（由子类实现）
     * 
     */
    protected abstract void abstractMethod();
    
    /**
     * 基本方法（实现） 又称钩子方法，子类会加以扩展，且命名规则当以do开始。
     * 如HttpServlet中的doGet()、doPost()等方法
     * 
     */
    protected void hookMethod() {

    }

    /**
     * 基本方法（实现）  子类并不实现或置换
     *
     */
    private final void concreteMethod() {
        //业务相关代码
    }
}
