package gioi2;

public class DatabaseOrderRepository implements OrderRepository {

    @Override
    public void save(Order order) {
        System.out.println("Lưu đơn hàng vào database: " + order.getOrderId());
    }

    @Override
    public void findAll() {
        System.out.println("Lấy tất cả đơn hàng từ database");
    }
}
