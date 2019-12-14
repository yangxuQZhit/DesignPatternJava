package behavioral.memento;

/**
 * @ClassName Memento
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 15:39
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
