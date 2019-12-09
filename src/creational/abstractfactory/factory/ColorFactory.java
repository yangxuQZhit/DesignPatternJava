package creational.abstractfactory.factory;

import creational.abstractfactory.color.Blue;
import creational.abstractfactory.color.Color;
import creational.abstractfactory.color.Green;
import creational.abstractfactory.color.Red;
import creational.abstractfactory.shape.Shape;

/**
 * @ClassName ColorFactory
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 21:04
 * @Version 1.0
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape createShape(String shape) {
        return null;
    }

    @Override
    public Color createColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else {
            return null;
        }
    }
}
