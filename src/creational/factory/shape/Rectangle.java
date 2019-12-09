package creational.factory.shape;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 14:16
 * @Version 1.0
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
