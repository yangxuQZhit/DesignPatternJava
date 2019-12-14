package behavioral.observer.observer;

import behavioral.observer.Subject;

/**
 * @ClassName Observer
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 16:01
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
