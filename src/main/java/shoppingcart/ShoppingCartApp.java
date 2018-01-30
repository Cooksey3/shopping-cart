package shoppingcart;

import java.util.Scanner;

public class ShoppingCartApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of the item: ");
		String itemName = input.nextLine();
		System.out.print("Enter the unit price: ");
		double itemPrice = input.nextDouble();
		System.out.print("Enter the quantity: ");
		int quantity = input.nextInt();

	}

}
