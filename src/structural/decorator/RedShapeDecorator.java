package structural.decorator;

import structural.decorator.shape.Shape;

/**
 * @ClassName RedShapeDecorator
 * @Description
 * @Author yangxu
 * @Date 2019-12-09 22:53
 **/
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
//        super.draw();
        decoratorShape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border Color: Red.");
    }
}
