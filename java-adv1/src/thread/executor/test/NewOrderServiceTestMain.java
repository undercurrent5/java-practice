package thread.executor.test;

public class NewOrderServiceTestMain {
    public static void main(String[] args) throws InterruptedException {
        String orderNo = "Order#1234";
        NewOrderService newOrderService = new NewOrderService();
        newOrderService.order(orderNo);
    }
}
