package core_java_program;
import java.util.Scanner;
public class Bit_oPT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, res;
		
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		
		res = num1|num2;
		System.out.println("Output is :-"+ res);
	}

}

