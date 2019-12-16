package behavioral.visitor;

import behavioral.visitor.computerpart.Computer;
import behavioral.visitor.computerpart.Keyboard;
import behavioral.visitor.computerpart.Monitor;
import behavioral.visitor.computerpart.Mouse;

/**
 * @interface ComputerPartVisitor
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 13:30
 **/
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
