package behavioral.visitor.computerpart;

import behavioral.visitor.ComputerPartVisitor;

/**
 * @ClassName Mouse
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 13:33
 **/
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
