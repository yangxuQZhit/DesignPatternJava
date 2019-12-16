package behavioral.visitor.computerpart;

import behavioral.visitor.ComputerPartVisitor;

/**
 * @ClassName Monitor
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 13:32
 **/
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
