package kha1;

//chịu trách nhiệm gửi email xác nhận.
public class EmailService {
    public void sendEmail(Order order){
        System.out.println(
                "Đã gửi email đến "
                        + order.getCustomer().getCustomerEmail()
                        + ": Đơn hàng "
                        + order.getOrderId()
                        + " đã được tạo"
        );
    }
}
