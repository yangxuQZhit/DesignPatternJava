package behavioral.state;

/**
 * @ClassName StatePatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 16:33
 **/
public class StatePatternDemo {
    public static void main(String[] args){
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
