package gioi1;

public class CreditCardPayment implements CardPayable{
    @Override
    public void onlyCard(double amount) {
        System.out.println("Xử lý thanh toán thẻ tín dụng: " + amount + " - Thành công");
    }

    @Override
    public void biggestPayment(double amount) {
        onlyCard(amount);
    }
}
