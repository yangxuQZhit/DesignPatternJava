package behavioral.strategy;

/**
 * @ClassName OperationMultiply
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 10:37
 **/
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int lhs, int rhs) {
        return lhs * rhs;
    }
}
