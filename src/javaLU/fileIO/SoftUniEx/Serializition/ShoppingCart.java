package javaLU.fileIO.SoftUniEx.Serializition;
import java.io.Serializable;
import java.util.List;

class ShoppingCart implements Serializable {
    private static final long serialVersionUID = 1L; // For version control
    private List<String> productIds;
    private int totalItems;
    private double totalPrice;

    public ShoppingCart(List<String> productIds, int totalItems, double totalPrice) {
        this.productIds = productIds;
        this.totalItems = totalItems;
        this.totalPrice = totalPrice;
    }
    public int getTotalItems(){
        return this.totalItems;
    }

    // Getters and setters omitted for brevity
}