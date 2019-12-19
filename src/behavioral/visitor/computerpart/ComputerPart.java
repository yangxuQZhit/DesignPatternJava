package behavioral.visitor.computerpart;

import behavioral.visitor.ComputerPartVisitor;

/**
 * @interface ComputerPart
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 13:29
 **/
public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
