package gioi2;

public class Main {
    public static void main(String[] args) {
        //Dùng FileOrderRepository và EmailService
        OrderRepository repo = new FileOrderRepository();
        NotificationService notify = new EmailService();

        OrderService orderService = new OrderService(repo, notify);

        Order order = new Order("ORD001");

        orderService.createOrder(order, "tu@gmail.com");
        System.out.println("=====================================================================");

        //Đổi sang DatabaseOrderRepository và SMSNotification
        OrderRepository databaseOrderRepository = new DatabaseOrderRepository();
        NotificationService smsNotification = new SMSNotification();

        OrderService orderService2 = new OrderService(databaseOrderRepository, smsNotification);

        Order order2 = new Order("ORD002");

        orderService2.createOrder(order2, "0987654321");
    }
}
