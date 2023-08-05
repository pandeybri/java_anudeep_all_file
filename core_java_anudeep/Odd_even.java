package core_java_anudeep;
import java.util.Scanner;
public class Odd_even {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num + " is an even number");
		}
		else {
			System.out.println(num + " is an odd number");
		}
// num%2==0 is use to check if reminder is zero than it is even number 
	}

}
