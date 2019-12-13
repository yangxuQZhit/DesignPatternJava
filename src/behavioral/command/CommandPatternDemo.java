package behavioral.command;

import behavioral.command.order.BuyStock;
import behavioral.command.order.SellStock;

/**
 * @ClassName CommandPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-11 17:29
 **/
public class CommandPatternDemo {
    public static void main(String[] args){
        Stock abc = new Stock("ABC", 10);

        BuyStock buyStockOrder = new BuyStock(abc);
        SellStock sellStockOrder = new SellStock(abc);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
