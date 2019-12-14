package behavioral.state;

/**
 * @ClassName StartState
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 16:34
 **/
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
