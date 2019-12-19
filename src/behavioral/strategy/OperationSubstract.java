package behavioral.strategy;

/**
 * @ClassName OperationSubstract
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 10:36
 **/
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int lhs, int rhs) {
        return lhs - rhs;
    }
}
