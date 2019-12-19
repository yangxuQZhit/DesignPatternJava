package behavioral.visitor.computerpart;

import behavioral.visitor.ComputerPartVisitor;

/**
 * @ClassName Keyboard
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 13:31
 **/
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
