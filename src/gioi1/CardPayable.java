package gioi1;

public interface CardPayable extends PaymentMethod{
    void onlyCard(double amount);
}
