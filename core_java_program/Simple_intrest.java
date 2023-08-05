package core_java_program;
import java.util.Scanner;
public class Simple_intrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter principle amount : ");
		double pa = sc.nextDouble();
		
		System.out.println("enter rate of intrest : ");
		double roi = sc.nextDouble();
		
		System.out.println("enter number of years : ");
		double noy = sc.nextDouble();
		
		double si = pa*roi*noy/100;
		System.out.println("Simple intrest is = "+si);
	}

}
