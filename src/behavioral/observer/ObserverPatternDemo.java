package behavioral.observer;

import behavioral.observer.observer.BinaryObserver;
import behavioral.observer.observer.HexaObserver;
import behavioral.observer.observer.OctalObserver;

/**
 * @ClassName ObserverPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 16:00
 **/
public class ObserverPatternDemo {
    public static void main(String[] args){
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
