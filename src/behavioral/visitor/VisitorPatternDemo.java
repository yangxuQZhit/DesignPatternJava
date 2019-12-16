package behavioral.visitor;

import behavioral.visitor.computerpart.Computer;
import behavioral.visitor.computerpart.ComputerPart;

/**
 * @ClassName VisitorPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 13:07
 **/
public class VisitorPatternDemo {
    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
