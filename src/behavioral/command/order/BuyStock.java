package behavioral.command.order;

import behavioral.command.Stock;

/**
 * @ClassName BuyStock
 * @Description
 * @Author yangxu
 * @Date 2019-12-13 08:56
 **/
public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
