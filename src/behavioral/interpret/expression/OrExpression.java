package behavioral.interpret.expression;

/**
 * @ClassName OrExpression
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 10:31
 **/
public class OrExpression implements Expression {
    private Expression lhs;
    private Expression rhs;

    public OrExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public boolean interpret(String context) {
        return lhs.interpret(context) || rhs.interpret(context);
    }
}
