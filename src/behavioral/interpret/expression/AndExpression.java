package behavioral.interpret.expression;

/**
 * @ClassName AndExpression
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 10:28
 **/
public class AndExpression implements Expression {
    private Expression lhs;
    private Expression rhs;

    public AndExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public boolean interpret(String context) {
        return lhs.interpret(context) && rhs.interpret(context);
    }
}
