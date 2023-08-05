package core_java_anudeep;
import java.util.Scanner;
public class Bit_oPT {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num1, num2, res;
		
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		
		res = num1|num2;
		System.out.println("Output is :-"+ res);
	}

}

