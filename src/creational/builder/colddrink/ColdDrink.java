package creational.builder.colddrink;

import creational.builder.Item;
import creational.builder.packing.Bottle;
import creational.builder.packing.Packing;

/**
 * @ClassName ColdDrink
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 22:01
 * @Version 1.0
 **/
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
