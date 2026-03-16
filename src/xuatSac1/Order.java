package xuatSac1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<OrderItem> items = new ArrayList<>();

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public double getTotal(){
        double total = 0;
        for(OrderItem item : items){
            total += item.getTotal();
        }
        return total;
    }

    public String getId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public List<OrderItem> getItems() { return items; }
}
