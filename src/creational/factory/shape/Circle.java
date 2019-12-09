package creational.factory.shape;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 14:13
 * @Version 1.0
 **/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
