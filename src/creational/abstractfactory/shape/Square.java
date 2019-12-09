package creational.abstractfactory.shape;

/**
 * @ClassName Square
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 20:50
 * @Version 1.0
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
