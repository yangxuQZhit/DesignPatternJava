package behavioral.observer;

import behavioral.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subject
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 16:01
 **/
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
