package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CareTaker
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 15:42
 **/
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
