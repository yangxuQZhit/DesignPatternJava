package creational.abstractfactory.color;

/**
 * @ClassName Blue
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 20:54
 * @Version 1.0
 **/
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
