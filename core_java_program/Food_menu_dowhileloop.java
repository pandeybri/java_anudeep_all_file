package core_java_program;

import java.util.Scanner;

public class Food_menu_dowhileloop {
//.using if else 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = null;
		double totalPrice = 0.0;

		do {
			System.out.println(" Welcome To");
			System.out.println("Hotel.Java.Developer");

			System.out.println("** Menu Card **");
			System.out.println("Starters Menu");
			System.out.println("1.  Paneer Chilly- Rs-100");
			System.out.println("2.  Aloo Tikki- Rs-200");
			System.out.println("3.  Paneer Pakoda- Rs-120");
			System.out.println("4.  Exit");

			System.out.print("Enter the item number you want to order (1-4): ");
			int itemNumber = sc.nextInt();

			double price = 0.0;
			String itemName = "";

			if (itemNumber == 1) {
				itemName = "Paneer Chilly";
				price = 100;
			} else if (itemNumber == 2) {
				itemName = "Aloo Tikki";
				price = 200;
			} else if (itemNumber == 3) {
				itemName = "Paneer Pakoda";
				price = 120;
			} else if (itemNumber == 4) {
				System.out.println("Thank you for your order!");
				break;
			} else {
				System.out.println("Invalid item number. Please try again.");
				continue;
			}

			System.out.println("You selected: " + itemName);
			System.out.println("Price: Rs" + price);

			totalPrice += price;
			System.out.print("Do you want to add any more items? (Y/N): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));

		do {
			System.out.println("* Main Course Menu *");
			System.out.println("5. Rice - Rs-90");
			System.out.println("6. Dal - Rs-90");
			System.out.println("7. Palak Paneer - Rs-90");
			System.out.println("8. Exit");

			System.out.print("Enter the item number you want to order (5-8): ");
			int itemNumber = sc.nextInt();

			double price = 0.0;
			String itemName = "";

			if (itemNumber == 5) {
				itemName = "Rice";
				price = 90;
			} else if (itemNumber == 6) {
				itemName = "Dal";
				price = 90;
			} else if (itemNumber == 7) {
				itemName = "Palak Paneer";
				price = 90;
			} else if (itemNumber == 8) {
				System.out.println("Thank you for your order!");
				break;
			} else {
				System.out.println("Invalid item number. Please try again.");
				continue;
			}

			System.out.println("You selected: " + itemName);
			System.out.println("Price: Rs" + price);

			totalPrice += price;
			System.out.print("Do you want to add any more items? (Y/N): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));

		do {
			System.out.println("** Desired Menu **");
			System.out.println("9. Gulab Jamun - Rs-90");
			System.out.println("10. Mango Ice Cream - Rs-90");
			System.out.println("11. Jalebi - Rs-90");
			System.out.println("12. Exit");

			System.out.print("Enter the item number you want to order (9-12): ");
			int itemNumber = sc.nextInt();

			double price = 0.0;
			String itemName = "";

			if (itemNumber == 9) {
				itemName = "Gulab Jamun";
				price = 90;
			} else if (itemNumber == 10) {
				itemName = "Mango Ice Cream";
				price = 90;
			} else if (itemNumber == 11) {
				itemName = "Jalebi";
				price = 90;
			} else if (itemNumber == 12) {
				System.out.println("Thank you for your order!");
				break;
			} else {
				System.out.println("Invalid item number. Please try again.");
				continue;
			}

			System.out.println("You selected: " + itemName);
			System.out.println("Price: Rs" + price);

			totalPrice += price;
			System.out.print("Do you want to add any more items? (Y/N): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));

		System.out.println("Your total bill amount is: Rs" + totalPrice);
		System.out.println("Thank you for your order!");

		sc.close();
	}
}
