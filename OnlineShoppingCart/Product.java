public class Product{

	private String productId;
	private String productName;
	private double price;
	private int stockQuantity;
	
	public Product(String productId, String productName, double price, int stockQuantity){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}
	
	public int getStockQuantity(){
		return stockQuantity;
	}
	
	public String getProductId(){
		return productId;
	}
	
	public double getPrice(){
		return price;
	}
	public void displayProductInfo(){
		System.out.println("Product ID: "+ productId);
		System.out.println("Product Name: "+ productName);
		System.out.println("Price: " + price);
		System.out.println("Stock Quantity: "+ stockQuantity);
	}
	
	public void updateStockQuantity(int quantity){
		stockQuantity +=quantity;
	}
	
}
