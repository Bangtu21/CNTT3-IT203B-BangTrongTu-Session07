package kha1;

import java.util.HashMap;
import java.util.Map;

//chịu trách nhiệm lưu và tìm kiếm đơn hàng.
public class OrderRepository {
    private Map<Integer, Order> orders = new HashMap<>();

    public void saveOrder(Order order){
        orders.put(order.getOrderId(), order);
        System.out.println("Đã lưu đơn hàng " + order.getOrderId());
    }

    public String searchOrder(){
        return null;
    }
}
