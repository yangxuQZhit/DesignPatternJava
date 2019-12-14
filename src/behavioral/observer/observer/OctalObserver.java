package behavioral.observer.observer;

import behavioral.observer.Subject;

/**
 * @ClassName OctalObserver
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 16:09
 **/
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
