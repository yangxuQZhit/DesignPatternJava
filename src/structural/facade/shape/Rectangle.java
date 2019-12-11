package structural.facade.shape;

/**
 * @ClassName Rectangle
 * @Description
 * @Author yangxu
 * @Date 2019-12-10 22:52
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
