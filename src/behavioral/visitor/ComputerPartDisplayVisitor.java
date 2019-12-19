package behavioral.visitor;

import behavioral.visitor.computerpart.Computer;
import behavioral.visitor.computerpart.Keyboard;
import behavioral.visitor.computerpart.Monitor;
import behavioral.visitor.computerpart.Mouse;

/**
 * @ClassName ComputerPartDisplayVisitor
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 13:40
 **/
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Display Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Display Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Display Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Display Monitor.");
    }
}
