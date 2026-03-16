package xuatSac1;

public class InvoiceGenerator {
    public void printBillFromOrder(Order order, double discount){

        System.out.println("=== HÓA ĐƠN ===");
        System.out.println("Khách: " + order.getCustomer().getName());

        for(OrderItem item : order.getItems()){
            System.out.println(
                    item.getProduct().getProductName()
                            + " - SL: " + item.getQuantity()
                            + " - Giá: " + item.getProduct().getProductPrice()
                            + " - Thành tiền: " + item.getTotal()
            );
        }

        double total = order.getTotal();
        double pay = total - discount;

        System.out.println("Tổng tiền: " + total);
        System.out.println("Giảm giá: " + discount);
        System.out.println("Cần thanh toán: " + pay);
    }
}
