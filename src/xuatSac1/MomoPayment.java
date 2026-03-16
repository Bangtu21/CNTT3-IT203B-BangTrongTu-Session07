package xuatSac1;

public class MomoPayment implements PaymentMethod{
    @Override
    public void payment(double amount) {
        System.out.printf("Thanh toán bằng MOMO: %,.0f VNĐ\n", amount);
    }
}
