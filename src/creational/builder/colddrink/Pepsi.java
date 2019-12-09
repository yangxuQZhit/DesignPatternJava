package creational.builder.colddrink;

/**
 * @ClassName Pepsi
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 22:18
 * @Version 1.0
 **/
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
