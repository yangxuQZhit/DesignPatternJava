package creational.builder;

/**
 * @ClassName BuilderPatternDemo
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 21:57
 * @Version 1.0
 **/
public class BuilderPatternDemo {
    public static void main(String[] args){
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        Meal nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
}
