package gioi1;

public class CODPayment implements CODPayable{

    @Override
    public void onlyCOD(double amount) {
        System.out.println("Xử lý thanh toán COD: " + amount + " - Thành công");
    }

    @Override
    public void biggestPayment(double amount) {
        onlyCOD(amount);
    }
}
