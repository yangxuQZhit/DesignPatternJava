package behavioral.command.order;

import behavioral.command.Stock;

/**
 * @ClassName SellStock
 * @Description
 * @Author yangxu
 * @Date 2019-12-13 08:57
 **/
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
