package gioi2;

public class FileOrderRepository implements OrderRepository{
    @Override
    public void save(Order order) {
        System.out.println("Lưu đơn hàng vào file: " + order.getOrderId());
    }

    @Override
    public void findAll() {
        System.out.println("Lấy tất cả đơn hàng từ file");
    }
}
