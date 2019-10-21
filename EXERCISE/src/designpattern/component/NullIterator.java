package designpattern.component;

import java.util.Iterator;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/3/8
 **/
public class NullIterator implements Iterator{
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
