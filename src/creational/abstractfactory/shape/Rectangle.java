package creational.abstractfactory.shape;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 20:51
 * @Version 1.0
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
