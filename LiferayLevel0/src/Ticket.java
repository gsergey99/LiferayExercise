import java.util.ArrayList;

public class Ticket {

	private double totalPrice = 0;
	private double priceTax = 0;
	private ArrayList<Product> products;

	public Ticket(ArrayList<Product> products) {
		this.products = products;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getPriceTax() {
		return priceTax;
	}

	public void setPriceTax(double priceTax) {
		this.priceTax = priceTax;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	public double aproxFiveDecimal(double taxPrice) {
		
		return Math.round(taxPrice * 20.0) / 20.0;
	}

	public void calculateTotalPrice() {
		
		double importedTax = 0.0;
		double sellTax = 0.0;
		
		for (Product product: products) {
			
			if (product.getType()!=null) {
				
				if (product.isImported()) {
					
					importedTax = Math.round((product.calculateProductPrice() * 5 / 100) * 100.0 ) / 100.0;
					importedTax =  aproxFiveDecimal(importedTax);
					
					sellTax =  Math.round((product.calculateProductPrice() * 10 / 100) * 100.0 ) / 100.0;
					sellTax =  aproxFiveDecimal(sellTax);
					
					product.setPrice(Math.round((product.calculateProductPrice() + sellTax + importedTax) * 100.0) / 100.0) ;
					
					this.totalPrice = this.totalPrice + product.getPrice();

					this.priceTax = this.priceTax + sellTax + importedTax;
					this.priceTax = Math.round(this.priceTax * 100.0) / 100.0;
				
				}else {
					
					sellTax = Math.round((product.calculateProductPrice() * 10 / 100) * 100.0 ) / 100.0;
					sellTax = aproxFiveDecimal(sellTax);
					
					product.setPrice(Math.round((product.calculateProductPrice() + sellTax) * 100.0) / 100.0) ;

					this.totalPrice = this.totalPrice + product.getPrice();

					this.priceTax = this.priceTax + sellTax;
					this.priceTax = Math.round(this.priceTax * 100.0) / 100.0;

					
				}
			
			}else {
				
				if (product.isImported()) {
					
					importedTax = (product.calculateProductPrice() * 5 / 100);
					importedTax =  aproxFiveDecimal(importedTax);
					
					product.setPrice(Math.round((product.calculateProductPrice() + importedTax) * 100.0) / 100.0) ;
					
					this.totalPrice = this.totalPrice + product.getPrice();

					this.priceTax = this.priceTax + importedTax;
					this.priceTax = Math.round(this.priceTax * 100.0) / 100.0;

	
				}else {
					
					this.totalPrice = this.totalPrice + product.calculateProductPrice();
					this.totalPrice = Math.round(this.totalPrice * 100.0) / 100.0;
					
					product.setPrice(Math.round(product.calculateProductPrice() * 100.0)/100.0 );
				}
			}
			
		}
		
	}
	
	public void printTiket() {
		
		System.out.println("**************************************************");
		System.out.println("******************** RESULT **********************");
		
		for (Product product: products) {
			System.out.println(product.toString());
		}
		
		System.out.println("Impuestos sobre las ventas " + this.priceTax + "€");
		System.out.println("Total: " +  Math.round(this.totalPrice * 100.0) / 100.0 + "€");
		
	}

}
