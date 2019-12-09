package creational.abstractfactory.factory;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.shape.Circle;
import creational.abstractfactory.shape.Rectangle;
import creational.abstractfactory.shape.Shape;
import creational.abstractfactory.shape.Square;

/**
 * @ClassName ShapeFactory
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 20:59
 * @Version 1.0
 **/
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape createShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            return  null;
        }
    }

    @Override
    public Color createColor(String color) {
        return null;
    }
}
