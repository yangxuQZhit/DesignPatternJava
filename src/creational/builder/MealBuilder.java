package creational.builder;

import creational.builder.burger.ChickenBurger;
import creational.builder.burger.VegBurger;
import creational.builder.colddrink.Coke;
import creational.builder.colddrink.Pepsi;

/**
 * @ClassName MealBuilder
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 10:40
 * @Version 1.0
 **/
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
