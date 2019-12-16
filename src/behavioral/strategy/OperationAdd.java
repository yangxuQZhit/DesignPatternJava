package behavioral.strategy;

/**
 * @ClassName OperationAdd
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 10:34
 **/
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int lhs, int rhs) {
        return lhs + rhs;
    }
}
