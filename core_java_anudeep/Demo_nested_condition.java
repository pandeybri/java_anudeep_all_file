//wap to accept age and gender from the user .age>60 m = 7% RI f 7.5% RI.
package core_java_anudeep;

import java.util.Scanner;

public class Demo_nested_condition {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int age;
		char gen;
		
		System.out.println("enter your age : ");
		age = sc.nextInt();
		System.out.println("Enter your gender :");
		gen = sc.next().charAt(0);
		
//		System.out.println("Age = "+age + " and gender "+gen);
		if(age>=60) {
			if(gen=='m'||gen=='M') {
				System.out.println("Your Rate of Intrest is 7%");
			}
			else {
				System.out.println("Your Rate of Intrest is 7.5%");
			}
			
		}
		else {
			System.out.println("Your Rate of Intrest is 5%");
		}
	}

}
