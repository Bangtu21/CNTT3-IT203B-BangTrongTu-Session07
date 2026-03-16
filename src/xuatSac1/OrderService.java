package xuatSac1;

public class OrderService {
    private OrderRepository repository;
    private NotificationService notification;

    public OrderService(OrderRepository repository,
                        NotificationService notification) {

        this.repository = repository;
        this.notification = notification;
    }

    public void createOrder(Order order,
                            DiscountStrategy discount,
                            PaymentMethod payment){

        double total = order.getTotal();
        double discountValue = discount.addDiscount(total);
        double pay = total - discountValue;

        InvoiceGenerator invoice = new InvoiceGenerator();
        invoice.printBillFromOrder(order, discountValue);

        payment.payment(pay);

        repository.save(order);

        notification.send(order.getCustomer().getEmail());
    }
}
