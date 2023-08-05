package core_java_anudeep;

import java.util.Scanner;

public class Array_greater_small_sum_number {
    static int size;
    static int user_no[];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		array_size();

	}
	
	public static void array_size() {
		System.out.println("what size you want in Array: ");
		size = sc.nextInt();
		user_no = new int[size];
		System.out.println("enter "+size+" number :");
		for(int i=0;i<size;i++) {
			user_no[i]= sc.nextInt();	
		}
		grater_no();
	}
	
	public static void grater_no() {
		int max = user_no[0];
		for(int j = 0; j<user_no.length; j++) {
			if(user_no[j]>max) {
				max = user_no[j];
				}
			
		}
		System.out.println("Lagest element present in given array: "+max);
		smallest_no();
	}
	public static void smallest_no() {
		int min = user_no[0];
		for(int j = 0; j<user_no.length; j++) {
			if(user_no[j]<min) {
				min = user_no[j];
				}
			
		}
		System.out.println("Smallest element present in given array: "+min);
		aver_no();
	}
	
	public static void aver_no() {
		double total = 0;
		
		for(int j=0; j<user_no.length; j++) {
			total += user_no[j];
		}
		
		double aver = total/user_no.length;
		System.out.println("average number is "+aver);
		sum_no();
	}
	
	public static void sum_no() {
		int total = 0;
		
		for(int j=0; j<user_no.length; j++) {
			total += user_no[j];
		}
		
		int sum = total;
		System.out.println("sum of given number is :" + sum);
	}

}
