package structural.facade.shape;

/**
 * @ClassName Circle
 * @Description
 * @Author yangxu
 * @Date 2019-12-10 22:51
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
