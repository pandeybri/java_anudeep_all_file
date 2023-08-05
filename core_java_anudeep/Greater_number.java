package core_java_anudeep;
import java.util.Scanner;
public class Greater_number {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2, num3;
		
		System.out.println("Enter first number : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		num2 = sc.nextInt();
		
		System.out.println("Enter third number : ");
		num3 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("greater number is "+ num1);
		}
		else if(num2>num3) {
			System.out.println("greater number is "+ num2);
		}
		else {
			System.out.println("greater number is "+ num3);
		}

	}

}
