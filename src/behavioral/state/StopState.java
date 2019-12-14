package behavioral.state;

/**
 * @ClassName StopState
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 16:35
 **/
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
