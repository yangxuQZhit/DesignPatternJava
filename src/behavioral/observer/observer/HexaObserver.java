package behavioral.observer.observer;

import behavioral.observer.Subject;

/**
 * @ClassName HexaObserver
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 16:09
 **/
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
