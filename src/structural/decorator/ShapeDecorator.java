package structural.decorator;

import structural.decorator.shape.Shape;

/**
 * @ClassName ShapeDecorator
 * @Description
 * @Author yangxu
 * @Date 2019-12-09 22:47
 **/
public class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
