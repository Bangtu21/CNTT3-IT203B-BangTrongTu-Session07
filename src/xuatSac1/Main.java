package xuatSac1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Product> products = new ArrayList<>();
    static List<Customer> customers = new ArrayList<>();
    static OrderRepository repository = new FileOrderRepository();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    1. Thêm sản phẩm mới
                    2. Thêm khách hàng mới
                    3. Tạo đơn hàng mới (chọn sản phẩm, chọn giảm giá, chọn thanh toán)
                    4. Xem danh sách đơn hàng
                    5. Tính tổng doanh thu
                    6. Thêm phương thức thanh toán mới (mô phỏng mở rộng)
                    7. Thêm chiến lược giảm giá mới (mô phỏng mở rộng)
                    8. Thoát
                    """);
            System.out.printf("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.printf("Mã sản phẩm: ");
                    String id = sc.nextLine();

                    System.out.printf("Tên sản phẩm: ");
                    String name = sc.nextLine();

                    System.out.printf("Giá sản phẩm: ");
                    double price = Double.parseDouble(sc.nextLine());

                    System.out.printf("Danh mục sản phẩm: ");
                    String cate = sc.nextLine();

                    products.add(new Product(id,name,price,cate));

                    System.out.println("Đã thêm sản phẩm " + id);
                    break;
                case 2:
                    System.out.printf("Tên: ");
                    String cname = sc.nextLine();

                    System.out.printf("Email: ");
                    String email = sc.nextLine();

                    System.out.printf("Phone: ");
                    String phone = sc.nextLine();

                    customers.add(new Customer(cname,email,phone));

                    System.out.println("Đã thêm khách hàng");
                    break;
                case 3:
                    Customer c = customers.get(0);
                    Product p = products.get(0);

                    Order order = new Order("ORD001", c);

                    order.addItem(new OrderItem(p,1));

                    DiscountStrategy discount = new PercentageDiscount(10);

                    PaymentMethod payment = new CreditCardPayment();

                    NotificationService notify = new EmailNotification();

                    OrderService service = new OrderService(repository,notify);

                    service.createOrder(order,discount,payment);
                    break;
                case 4:
                    for(Order o : repository.findAll()){
                        System.out.println(o.getId()
                                + " - "
                                + o.getCustomer().getName()
                                + " - "
                                + o.getTotal());
                    }
                    break;
                case 5:
                    double revenue = 0;

                    for(Order o : repository.findAll()){
                        revenue += o.getTotal();
                    }

                    System.out.println("Tổng doanh thu: " + revenue);
                    break;
                case 6:
                    System.out.printf("Thêm phương thức thanh toán mới: ");
                    String newPayment = sc.nextLine();
                    System.out.println("Đã thêm phương thưc thanh toán "+newPayment);
                    break;
                case 7:
                    System.out.printf("Thêm giảm giá mới: ");
                    int percent = Integer.parseInt(sc.nextLine());
                    System.out.println("Đã thêm chiến lược giảm giá VIP");
                    break;
                case 8:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ hãy chọn lại");
                    break;

            }
        }while(choice!=8);
    }
}
