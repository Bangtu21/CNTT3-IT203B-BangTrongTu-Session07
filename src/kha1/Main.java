package kha1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop Acer",  15000000.0);
        Product p2 = new Product(2, "Tai nghe Hyper X", 300000.0);
        Product p3 = new Product(3, "Chuột Logitech", 4500000.0);

        Map<Integer, Product> productsList = new HashMap<>();
        productsList.put(p1.getProductId(), p1);
        productsList.put(p2.getProductId(), p2);
        productsList.put(p3.getProductId(), p3);
        for (Product p : productsList.values()) {
            System.out.println("Đã thêm sản phẩm: " + p.getProductId());
        }
        System.out.println("=========================================================");
        Customer c1 = new Customer("Tú", "tu@gmail.com", "Cao Bằng");
        Customer c2 = new Customer("Thành", "thanh@gmail.com", "Hà Nội");
        Customer c3 = new Customer("Dũng", "dung@gmail.com", "Nam Định");

        Map<Integer, Customer> customerList = new HashMap<>();
        customerList.put(1, c1);
        customerList.put(2, c2);
        customerList.put(3, c3);
        for (Customer c : customerList.values()) {
            System.out.println("Đã thêm khách hàng: "+c.getCustomerName());
        }

        System.out.println("==========================================================");
        Order order1 = new Order(1, c1); // tạo đơn hàng 1

        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p2);

        System.out.println("Đơn hàng " + order1.getOrderId() + " được tạo");

        System.out.println("==========================================================");
        OrderCalculator calculator = new OrderCalculator();
        double calculatePrice = calculator.calculateOrderPrice(order1);
        System.out.printf("Tổng tiền: %,.0fVNĐ\n", calculatePrice);

        System.out.println("==========================================================");
        OrderRepository repository = new OrderRepository();
        repository.saveOrder(order1);

        System.out.println("==========================================================");
        EmailService emailService = new EmailService();
        emailService.sendEmail(order1);
    }
}
