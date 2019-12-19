package behavioral.strategy;

/**
 * @ClassName Context
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 10:37
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int lhs, int rhs) {
        return strategy.doOperation(lhs, rhs);
    }
}
