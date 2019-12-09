package structural.decorator;

import structural.decorator.shape.Circle;
import structural.decorator.shape.Rectangle;
import structural.decorator.shape.Shape;

/**
 * @ClassName DecoratorPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-09 23:18
 **/
public class DecoratorPatternDemo {
    public static void main(String[] args){
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal Border.");
        circle.draw();

        System.out.println("Circle with red Border.");
        redCircle.draw();

        System.out.println("Rectangle with red Border.");
        redRectangle.draw();
    }
}
