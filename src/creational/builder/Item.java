package creational.builder;

import creational.builder.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
