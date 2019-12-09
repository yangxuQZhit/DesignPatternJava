package creational.abstractfactory.color;

/**
 * @ClassName Green
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 20:53
 * @Version 1.0
 **/
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
