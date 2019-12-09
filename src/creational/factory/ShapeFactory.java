package creational.factory;

import creational.factory.shape.Circle;
import creational.factory.shape.Rectangle;
import creational.factory.shape.Shape;
import creational.factory.shape.Square;

/**
 * @ClassName ShapeFactory
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 14:17
 * @Version 1.0
 **/
public class ShapeFactory {
    public Shape createShape(String type) {
        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
