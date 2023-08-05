package core_java_program;
import java.util.Scanner;
public class Divisble_by_seven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
