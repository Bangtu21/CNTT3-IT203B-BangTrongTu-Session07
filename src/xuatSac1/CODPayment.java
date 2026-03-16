package xuatSac1;

public class CODPayment implements PaymentMethod{

    @Override
    public void payment(double amount) {
        System.out.printf("Thanh toán COD: %,.0f VNĐ\n", amount);
    }
}
