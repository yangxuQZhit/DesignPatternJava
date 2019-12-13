package behavioral.command;

import behavioral.command.order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Broker
 * @Description
 * @Author yangxu
 * @Date 2019-12-13 08:58
 **/
public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
