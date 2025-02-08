public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("001", "Laptop", 800.00, 10);
        Product product2 = new Product("002", "Smartphone", 500.00, 20);
        
        Customer customer = new Customer("Customer_001", "Raj Guragain");

        customer.addToCart(product1, 2);
        customer.addToCart(product2, 1);

        System.out.println("Cart Items:");
        customer.getCart().displayCartItems();

        customer.placeOrder();
    }
}
