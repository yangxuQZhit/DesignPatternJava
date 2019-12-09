package creational.abstractfactory.color;

/**
 * @ClassName Red
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 20:52
 * @Version 1.0
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
