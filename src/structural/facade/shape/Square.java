package structural.facade.shape;

/**
 * @ClassName Square
 * @Description
 * @Author yangxu
 * @Date 2019-12-10 22:52
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
