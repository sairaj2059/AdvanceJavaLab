import java.util.ArrayList;

public class Order {
 private String orderId;
    private Customer customer;
    private ArrayList<Product> orderedProducts;
    private double totalAmount;

    public Order(String orderId, String customerId, ShoppingCart cart, double totalAmount) {
        this.orderId = orderId;
        this.customer = new Customer(customerId, "");
        this.orderedProducts = new ArrayList<>(cart.getCartItems());
        this.totalAmount = totalAmount;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Ordered Products: ");
        for (Product product : orderedProducts) {
            product.displayProductInfo();
        }
    }
}
