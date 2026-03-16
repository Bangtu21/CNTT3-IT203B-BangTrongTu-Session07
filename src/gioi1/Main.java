package gioi1;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod cod = new CODPayment();
        PaymentMethod card = new CreditCardPayment();
        PaymentMethod momo = new MomoPayment();

        processor.pay(cod, 500000);
        processor.pay(card, 1000000);
        processor.pay(momo, 750000);


//Thay thế CreditCardPayment bằng MomoPayment trong cùng interface
        System.out.println("Kiểm tra LSP:");

        PaymentMethod payment = new CreditCardPayment();
        processor.pay(payment, 1500000);

        payment = new MomoPayment();
        processor.pay(payment, 550000);
    }
}
