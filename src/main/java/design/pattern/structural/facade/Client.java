package design.pattern.structural.facade;

public class Client {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("product123", 100.0, "1234-5678-9012-3456", "123 Main St", "user@example.com");
    }
}