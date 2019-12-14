package behavioral.state;

/**
 * @ClassName Context
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 16:35
 **/
public class Context {
    private State state;
    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
