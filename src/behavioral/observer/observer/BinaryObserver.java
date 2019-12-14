package behavioral.observer.observer;

import behavioral.observer.Subject;

/**
 * @ClassName BinaryObserver
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 16:09
 **/
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
