package xuatSac1;

public class SMSNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Đã gửi SMS xác nhận");
    }
}
