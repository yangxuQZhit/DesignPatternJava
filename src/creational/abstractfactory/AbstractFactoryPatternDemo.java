package creational.abstractfactory;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.shape.Shape;

/**
 * @ClassName AbstractFactoryPatternDemo
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 21:11
 * @Version 1.0
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory shapeFactory = producer.createFactory("Shape");
        Shape circle = shapeFactory.createShape("Circle");
        Shape square = shapeFactory.createShape("Square");
        Shape rectangle = shapeFactory.createShape("Rectangle");

        circle.draw();
        square.draw();
        rectangle.draw();

        AbstractFactory colorFactory = producer.createFactory("Color");
        Color red = colorFactory.createColor("Red");
        Color green = colorFactory.createColor("Green");
        Color blue = colorFactory.createColor("Blue");

        red.fill();
        green.fill();
        blue.fill();
    }
}
