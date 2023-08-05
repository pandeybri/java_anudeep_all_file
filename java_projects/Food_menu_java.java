package java_projects;
import java.util.Scanner;
public class Food_menu_java {
//	using switch case

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

			switch (itemNumber) {
				case 1:
					itemName = "Paneer Chilly";
					price = 100;
					break;
				case 2:
					itemName = "Aloo Tikki";
					price = 200;
					break;
				case 3:
					itemName = "Paneer Pakoda";
					price = 120;
					break;
				case 4:
					System.out.println("Thank you for your order!");
					break;
				default:
					System.out.println("Invalid item number. Please try again.");
					continue;
			}

			if (itemNumber == 4)
				break;

			System.out.println("You selected: " + itemName);
			System.out.println("Price: Rs" + price);

			totalPrice += price;
			System.out.print("Do you want to add any more items? (Y/N): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));

		do {
			System.out.println("* Main Course Menu *");
			System.out.println("5. Rice - Rs-150");
			System.out.println("6. Dal - Rs-100");
			System.out.println("7. Palak Paneer - Rs-140");
			System.out.println("8. Exit");

			System.out.print("Enter the item number you want to order (5-8): ");
			int itemNumber = sc.nextInt();

			double price = 0.0;
			String itemName = "";

			switch (itemNumber) {
				case 5:
					itemName = "Rice";
					price = 150;
					break;
				case 6:
					itemName = "Dal";
					price = 100;
					break;
				case 7:
					itemName = "Palak Paneer";
					price = 140;
					break;
				case 8:
					System.out.println("Thank you for your order!");
					break;
				default:
					System.out.println("Invalid item number. Please try again.");
					continue;
			}

			if (itemNumber == 8)
				break;

			System.out.println("You selected: " + itemName);
			System.out.println("Price: Rs" + price);

			totalPrice += price;
			System.out.print("Do you want to add any more items? (Y/N): ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));

		do {
			System.out.println("** Desired Menu **");
			System.out.println("9. Gulab Jamun - Rs-100");
			System.out.println("10. Mango Ice Cream - Rs-80");
			System.out.println("11. Jalebi - Rs-90");
		
			System.out.println("12. Exit");

			System.out.print("Enter the item number you want to order (9-12): ");
			int itemNumber = sc.nextInt();

			double price = 0.0;
			String itemName = "";

			switch (itemNumber) {
				case 9:
					itemName = "Gulab Jamun";
					price = 100;
					break;
				case 10:
					itemName = "Mango Ice Cream";
					price = 80;
					break;
				case 11:
					itemName = "Jalebi";
					price = 90;
					break;
				case 12:
					System.out.println("Thank you for your order!");
					break;
				default:
					System.out.println("Invalid item number. Please try again.");
					continue;
			}

			if (itemNumber == 12)
				break;

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
