package core_java_program;
import java.util.Scanner;
public class Profit_loss_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sp, cp, res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter selling price");
		sp = sc.nextInt();
		
		System.out.println("Enter cost price");
		cp = sc.nextInt();
		
		res = sp-cp;
		
		System.out.println("the profit is = "+res);
	}

}
