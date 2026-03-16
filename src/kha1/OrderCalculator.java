package kha1;

import java.util.Map;

//chịu trách nhiệm tính tổng tiền đơn hàng.
public class OrderCalculator {
    public double calculateOrderPrice(Order orderPrice) {
        double total = 0;

        for (Product p : orderPrice.getProducts()) {
            total += p.getProductPrice();
        }

        return total;
    }
}
