package structural.facade;

import structural.facade.shape.Circle;
import structural.facade.shape.Rectangle;
import structural.facade.shape.Shape;
import structural.facade.shape.Square;

/**
 * @ClassName ShapeMaker
 * @Description
 * @Author yangxu
 * @Date 2019-12-10 22:53
 **/
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCicle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
