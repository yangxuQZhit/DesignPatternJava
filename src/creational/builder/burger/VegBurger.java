package creational.builder.burger;

/**
 * @ClassName VegBurger
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 22:15
 * @Version 1.0
 **/
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
