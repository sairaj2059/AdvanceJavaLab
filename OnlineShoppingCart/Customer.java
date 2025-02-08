public class Customer {
    private String customerId;
    private String name;
    private ShoppingCart cart;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.cart = new ShoppingCart();
    }

    public String getCustomerId(){
        return customerId;
    }

    public ShoppingCart getCart(){
        return cart;
    }

    public void addToCart(Product product, int quantity) {
        cart.addProduct(product, quantity);
    }

    public void removeFromCart(Product product) {
        cart.removeProduct(product);
    }

    public void placeOrder() {
        double totalAmount = cart.calculateTotal();
        
        Order order = new Order("ABC", customerId, cart, totalAmount);
        order.displayOrderDetails();
    }
}