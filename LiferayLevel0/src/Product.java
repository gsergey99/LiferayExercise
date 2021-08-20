
public class Product {

	private int quantity;
	private String name;
	private double price;
	private boolean imported;
	private String type;
	
	public Product(int quantity, String name, double price, boolean imported, String type) {
		this.quantity = quantity;
		this.name = name;
		this.price = price;
		this.imported = imported;
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isImported() {
		return imported;
	}
	public void setImported(boolean imported) {
		this.imported = imported;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double calculateProductPrice() {
		return this.quantity * this.price;
	}
	@Override
	public String toString() {
		if (this.imported) {
			return quantity + " " + name + " importado: " + price + " €";
		}
		return quantity + " " + name + ": " + price + " €";
	}
	
	
	
}
