package xuatSac1;

public class EmailNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Đã gửi Email xác nhận");
    }
}
