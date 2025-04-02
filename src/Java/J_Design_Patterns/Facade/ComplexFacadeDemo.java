package Java.J_Design_Patterns.Facade;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexFacadeDemo {
}
class OrderFacade {
    private InventorySystem inventory;
    private PaymentProcessor payment;
    private ShippingService shipping;
    private NotificationService notification;
    private CustomerDatabase customerDb;

    public OrderFacade() {
        this.inventory = new InventorySystem();
        this.payment = new PaymentProcessor();
        this.shipping = new ShippingService();
        this.notification = new NotificationService();
        this.customerDb = new CustomerDatabase();
    }

    public Map<String, Object> placeOrder(String customerId, String productId, int quantity, Map<String, String> paymentDetails) {
        Map<String, Object> result = new HashMap<>();

        // Get customer details
        Map<String, Object> customer = customerDb.getCustomerDetails(customerId);

        // Check inventory
        if (!inventory.checkProductAvailability(productId, quantity)) {
            result.put("success", false);
            result.put("message", "Product not available in requested quantity");
            return result;
        }

        // Reserve product
        String reservationId = inventory.reserveProduct(productId, quantity);

        // Calculate total with shipping
        double productPrice = 99.99; // Would come from product database
        double total = productPrice * quantity;

        // Prepare product list for shipping calculation
        List<Map<String, Object>> productList = List.of(Map.of(
                "productId", productId,
                "quantity", quantity
        ));

        double shippingCost = shipping.calculateShippingCost(
                (String) customer.get("address"),
                productList
        );
        double grandTotal = total + shippingCost;

        // Process payment
        if (!payment.validatePaymentDetails(paymentDetails)) {
            inventory.unreserveProduct(productId, quantity, reservationId);
            result.put("success", false);
            result.put("message", "Payment validation failed");
            return result;
        }

        String paymentId = payment.processPayment(paymentDetails, grandTotal);

        // Create order ID
        String orderId = "ORD-" + reservationId + "-" + paymentId;

        // Schedule delivery
        String shippingId = shipping.scheduleDelivery(
                orderId,
                (String) customer.get("address"),
                productList
        );

        // Send notifications
        notification.sendEmail(
                (String) customer.get("email"),
                "Order Confirmation",
                "Your order #" + orderId + " has been placed. Payment: $" + grandTotal + ", Shipping: " + shippingId
        );
        notification.sendSMS(
                (String) customer.get("phone"),
                "Your order #" + orderId + " has been placed. Total: $" + grandTotal
        );

        // Return success result
        result.put("success", true);
        result.put("orderId", orderId);
        result.put("total", grandTotal);
        result.put("shippingId", shippingId);

        return result;
    }
}

class InventorySystem {
    public boolean checkProductAvailability(String productId, int quantity) {
        System.out.println("Checking if " + quantity + " units of product " + productId + " are available");
        return true;
    }

    public String reserveProduct(String productId, int quantity) {
        System.out.println("Reserving " + quantity + " units of product " + productId);
        return "INV-12345";
    }

    public void unreserveProduct(String productId, int quantity, String reservationId) {
        System.out.println("Canceling reservation " + reservationId);
    }
}

class PaymentProcessor {
    public boolean validatePaymentDetails(Map<String, String> paymentInfo) {
        System.out.println("Validating payment information");
        return true;
    }

    public String processPayment(Map<String, String> paymentInfo, double amount) {
        System.out.println("Processing payment of $" + amount);
        return "PMT-67890";
    }
}

class ShippingService {
    public double calculateShippingCost(String address, List<Map<String, Object>> products) {
        System.out.println("Calculating shipping costs");
        return 15.99;
    }

    public String scheduleDelivery(String orderId, String address, List<Map<String, Object>> products) {
        System.out.println("Scheduling delivery for order " + orderId);
        return "SHP-54321";
    }
}

class NotificationService {
    public void sendEmail(String toEmail, String subject, String body) {
        System.out.println("Sending email to " + toEmail + ": " + subject);
    }

    public void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber);
    }
}

class CustomerDatabase {
    public Map<String, Object> getCustomerDetails(String customerId) {
        System.out.println("Retrieving information for customer " + customerId);
        Map<String, Object> customer = new HashMap<>();
        customer.put("name", "John Doe");
        customer.put("email", "john@example.com");
        customer.put("phone", "123-456-7890");
        customer.put("address", "123 Main St");
        return customer;
    }
}
