package core_java_anudeep;
import java.util.Scanner;
public class Divisble_by_seven {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		 System.out.println("enter your number : ");
		 
		 int num = sc.nextInt();
		 
		 if(num%7==0) {
			 System.out.println("your number are divisble by 7.");
		 }
		 else {
			 System.out.println("Sorry, your number is not divisble by 7.");
		 }
	}

}
