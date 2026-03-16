package xuatSac1;

public class VNPayPayment implements PaymentMethod{
    @Override
    public void payment(double amount) {
        System.out.printf("Thanh toán bằng VNPay: %,.0f VNĐ\n", amount);
    }
}
