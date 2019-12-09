package structural.decorator.shape;

/**
 * @ClassName Rectangle
 * @Description
 * @Author yangxu
 * @Date 2019-12-09 22:46
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle.");
    }
}
