package creational.factory.shape;

/**
 * @ClassName Square
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 14:14
 * @Version 1.0
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
