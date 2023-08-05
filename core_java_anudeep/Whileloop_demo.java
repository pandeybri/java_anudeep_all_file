package core_java_anudeep;

import java.util.Scanner;

public class Whileloop_demo {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++) {
			for(k=1;k<i;k++) {
				System.out.print(" ");
			}
				for(j=5;j>=i;j--) {
					System.out.print("*");
				}
			
			System.out.println( );
		}
	};

}
