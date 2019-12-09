package creational.abstractfactory.factory;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.shape.Shape;

/**
 * @ClassName AbstractFactory
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 20:56
 * @Version 1.0
 **/
public abstract class AbstractFactory {
    public abstract Shape createShape(String shape);
    public abstract Color createColor(String color);
}
