package behavioral.visitor.computerpart;

import behavioral.visitor.ComputerPartVisitor;

/**
 * @ClassName Computer
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 13:33
 **/
public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
