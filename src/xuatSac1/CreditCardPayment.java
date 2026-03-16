package xuatSac1;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void payment(double amount) {
        System.out.printf("Thanh toán bằng thẻ tín dụng: %,.0f VNĐ\n", amount);
    }
}
