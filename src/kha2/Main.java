package kha2;

public class Main {
    public static void main(String[] args) {
        double total = 1000000;

        //áp dụng PercentageDiscount 10%
        OrderCalculator order1 = new OrderCalculator(new PercentageDiscount(10));
        double money = order1.calculateTotal(total);
        System.out.printf("Số tiền sau giảm: %,.0f\n", money);

        //áp dụng FixedDiscount 50.000
        OrderCalculator order2 = new OrderCalculator(new FixedDiscount(50000));
        double money2 = order2.calculateTotal(total);
        System.out.printf("Số tiên sau giảm: %,.0f\n", money2);

        //áp dụng NoDiscount
        OrderCalculator order3 = new OrderCalculator(new NoDiscount());
        double money3 = order3.calculateTotal(total);
        System.out.printf("Số tiên sau giảm: %,.0f\n", money3);

        //Thêm HolidayDiscount 15% (không sửa code cũ)
        OrderCalculator order4 = new OrderCalculator(new HolidayDiscount());
        double money4 = order4.calculateTotal(total);
        System.out.printf("Số tiên sau giảm: %,.0f\n", money4);

    }
}
