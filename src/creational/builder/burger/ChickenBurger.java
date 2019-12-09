package creational.builder.burger;

/**
 * @ClassName ChickenBurger
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 22:17
 * @Version 1.0
 **/
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
