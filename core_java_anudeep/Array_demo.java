package core_java_anudeep;

import java.util.Scanner;

public class Array_demo {


	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arr_demo();
	}
	
	public static void arr_demo() {
		int age[] = new int[10];//syntace of Array int[10]is provide range of stote the data
		String name[] = {"a","b","f","gg","fd","e","ytyt","rr","wtr","ertrg"};
		//Datatype array_name[] = new Datatype[array_size];
		
		age[0] = 12;
		age[1] = 13;
		age[2] = 14;
		age[3] = 15;
		age[4]=16;
		age[5]=17;
		age[6]=18;
		age[7]=19;
		age[8]=20;
		age[9]= 21;
		
		int i;
		System.out.println("enter name and age in array");
		for(i=0;i<10;i++) {
			
			name[i]=sc.next();
			age[i]=sc.nextInt();
		}
		System.out.println(name[4]+" age "+name[6]);
		for(i=0;i<10;i++) {
			System.out.println(name[i]+"\t"+age[i]);
			
		}
		
		
	}

}
