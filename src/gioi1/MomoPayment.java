package gioi1;

public class MomoPayment implements EWalletPayable{

    @Override
    public void onlyEWallet(double amount) {
        System.out.println("Xử lý thanh toán MoMo: " + amount + " - Thành công");
    }

    @Override
    public void biggestPayment(double amount) {
        onlyEWallet(amount);
    }
}
