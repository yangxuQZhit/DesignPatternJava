package creational.abstractfactory;

import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.factory.ColorFactory;
import creational.abstractfactory.factory.ShapeFactory;

/**
 * @ClassName FactoryProducer
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 21:08
 * @Version 1.0
 **/
public class FactoryProducer {
    public AbstractFactory createFactory(String factory) {
        if (factory == null) {
            return null;
        }
        if (factory.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else if (factory.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else {
            return null;
        }
    }
}
