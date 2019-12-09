package creational.builder.burger;

import creational.builder.Item;
import creational.builder.packing.Packing;
import creational.builder.packing.Wrapper;

/**
 * @ClassName Burger
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 22:01
 * @Version 1.0
 **/
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
