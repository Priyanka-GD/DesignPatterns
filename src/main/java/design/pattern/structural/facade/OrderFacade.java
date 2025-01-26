package design.pattern.structural.facade;

// Subsystems
class InventoryService {
    public boolean checkAvailability(String productId) {
        // Check in database
        return true;
    }
}

class PaymentService {
    public boolean processPayment(double amount, String creditCardNumber) {
        // Process payment
        return true;
    }
}

class ShippingService {
    public void arrangeShipment(String orderId, String address) {
        // Arrange shipment
    }
}

class EmailService {
    public void sendConfirmationEmail(String orderId, String email) {
        // Send confirmation email
    }
}

// Facade
class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private EmailService emailService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.emailService = new EmailService();
    }

    public void placeOrder(String productId, double amount, String creditCardNumber, String address, String email) {
        if (inventoryService.checkAvailability(productId)) {
            if (paymentService.processPayment(amount, creditCardNumber)) {
                String orderId = generateOrderId();
                shippingService.arrangeShipment(orderId, address);
                emailService.sendConfirmationEmail(orderId, email);
                System.out.println("Order placed successfully.");
            } else {
                System.out.println("Payment failed.");
            }
        } else {
            System.out.println("Product out of stock.");
        }
    }

    private String generateOrderId() {
        return java.util.UUID.randomUUID().toString();
    }
}

// Client code
