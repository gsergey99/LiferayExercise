import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static Scanner sc = new Scanner(System.in);
	


	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		int number, quantity;
		String name, type, importedQuestion;
		double price;
		boolean imported;
		int index = 1;
		
		
		System.out.println("**************************");
		System.out.println("1. PLEASE, INDICATE THE NUMBER OF ARTICLES YOU WANT (E.j: 1,2...)");
		
		number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			
			System.out.println(" **** PRODUCT " + index + " ****");
			System.out.println(" 2. NAME OF THE PRODUCT");
			name = getInput();
			
			System.out.println(" 3. QUANTITY OF THE PRODUCT");
			quantity = sc.nextInt();
			
			System.out.println(" 4. INDICATE THE PRICE PER UNIT (E.j: 12,99)");
			price = sc.nextDouble();
			
			System.out.println(" 5. IT IS IMPORTED (yes/no)");
			importedQuestion = sc.next();
			
			if (importedQuestion.equalsIgnoreCase("yes")) {
				imported = true;
			}else {
				imported = false;
			}
			
			System.out.println(" 6. TYPE OF PRODUCT (FOOD, MEDICAL, BOOKS, OTHER)");
			
			type = sc.next();
			
			if (!type.equalsIgnoreCase("OTHER") ) {
				type = null;
			}
			
			products.add(new Product(quantity, name, price, imported, type));
			index++;
		}
		
		Ticket ticket = new Ticket(products);
		ticket.calculateTotalPrice();
		ticket.printTiket();

	}
	
	public static String getInput() {
	    Scanner scanner = new Scanner(System.in);
	    return scanner.nextLine();
	}

}
