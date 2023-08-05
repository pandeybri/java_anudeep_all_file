package core_java_program;
import java .util.Scanner;
public class Area_circumference_of_circle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		Area of circle
		System.out.println("Enter radius value : ");
		double radius = sc.nextDouble();
		
		double area = Math.PI*radius*radius;
		
//		circumference of circle
		System.out.println("enter Radius for calculating circle : ");
		double rad = sc.nextDouble();
		
		double circum = 2*Math.PI*rad;
		
		System.out.println("Area of Circle is = "+area);
		System.out.println("circumference of circle is = "+circum);

	}

}
