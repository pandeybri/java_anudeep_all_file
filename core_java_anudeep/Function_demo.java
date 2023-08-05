package core_java_anudeep;

import java.util.Scanner;

public class Function_demo {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("hiii");
//		Function_demo obj = new Function_demo(); //call the object
//		obj.fact_demo();
		
//		fibno_demo();
		GRT();
		

//		demo();
	}

	public static void demo() {
		System.out.println("brijesh");
		
	}
	
	public void fact_demo() {
		int num,fact=1;
		System.out.println("enter your number");
		num = sc.nextInt();
		
		
		while(num>1) {
			fact = fact*num;
			num--;
		}
		System.out.println("your factorial is "+ fact);
	}
	
	public static void fibno_demo() {
		int ser,num1=0,num2=1,res,i;
		System.out.println("enter number");
		ser = sc.nextInt();
		System.out.println(num1+ "\n" +num2);
		
		for(i=1;i<=ser-2;i++) {
			res = num1+num2;
			System.out.println(res);
			num1=num2;
			num2=res;
		}
	}
	
	public static void GRT() {
		System.out.println("enter 5 number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4= sc.nextInt();
		int num5 = sc.nextInt();
		
		if(num1>num2 && num1>num3 && num1>num4 && num1>num5) {
			System.out.println(num1);
		}
		else if(num2>num1 && num2>num3 && num2>num4 && num2>num5) {
			System.out.println(num2);
		}
		else if(num3>num1 && num3>num2 && num3>num4 && num3>num5) {
			System.out.println(num3);
		}
		else if(num4>num1 && num4>num2 && num4>num5 && num4>num3) {
			System.out.println(num4);
		}
		else {
			System.out.println(num5);
		}
	}
}
