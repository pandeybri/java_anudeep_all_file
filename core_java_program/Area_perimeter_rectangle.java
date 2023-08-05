package core_java_program;
import java.util.Scanner;
public class Area_perimeter_rectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your length : ");
		double length = sc.nextDouble();
		
		System.out.println("What is your breadth : ");
		double breadth = sc.nextDouble();
	
		double area = length*breadth/2;
		double perimeter =2*(length+breadth);
		System.out.println("Area of Rectangle = "+area);
		System.out.println("Area of Rectangle = "+perimeter);
	}

}
