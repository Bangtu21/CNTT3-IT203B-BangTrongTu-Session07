package gioi1;

public interface EWalletPayable extends PaymentMethod {
    void onlyEWallet(double amount);
}
