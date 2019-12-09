package creational.factory;

import creational.factory.shape.Shape;

/**
 * @ClassName FactoryPatternDemo
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 14:22
 * @Version 1.0
 **/
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("CIRCLE");
        Shape square = factory.createShape("SQUARE");
        Shape rectangle = factory.createShape("RECTANGLE");

        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
