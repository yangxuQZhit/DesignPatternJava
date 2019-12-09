package structural.decorator.shape;

/**
 * @ClassName Circle
 * @Description
 * @Author yangxu
 * @Date 2019-12-09 22:45
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle.");
    }
}
