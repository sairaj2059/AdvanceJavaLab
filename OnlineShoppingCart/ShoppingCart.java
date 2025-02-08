import java.util.ArrayList;

public class ShoppingCart{
	private ArrayList<Product> cartItems;

    // Constructor
    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

	public ArrayList<Product> getCartItems(){
		return cartItems;
	}
    // Method to add product to cart
    public void addProduct(Product product, int quantity) {
        cartItems.add(product);
        product.updateStockQuantity(product.getStockQuantity() - quantity);
    }

    // Method to remove product from cart
    public void removeProduct(Product product) {
        cartItems.remove(product);
    }

    // Method to calculate total cart value
    public double calculateTotal() {
        double total = 0.0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
    }

    // Method to display cart items
    public void displayCartItems() {
        for (Product product : cartItems) {
            product.displayProductInfo();
        }
    }
}

