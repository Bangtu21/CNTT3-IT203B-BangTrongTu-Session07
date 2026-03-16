package kha1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//chứa thông tin đơn hàng (mã đơn, khách hàng, danh sách sản phẩm, tổng tiền).
public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products = new ArrayList<>();
    private double totalPrice;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
