package behavioral.command;

/**
 * @ClassName Stock
 * @Description
 * @Author yangxu
 * @Date 2019-12-13 08:51
 **/
public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought.");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold.");
    }
}
