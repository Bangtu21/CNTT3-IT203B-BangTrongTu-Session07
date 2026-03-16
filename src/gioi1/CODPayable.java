package gioi1;

public interface CODPayable extends PaymentMethod {
    void onlyCOD(double amount);
}
