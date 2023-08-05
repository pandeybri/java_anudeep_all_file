
package core_java_program;

import java.util.Arrays;
import java.util.Scanner;

public class Array_pract {
	int row,col,i,j;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Array_pract obj = new Array_pract();
		obj.for_each();
	}
	
	public void for_each() {
		System.out.println("Enter the size of row");
        row = sc.nextInt();
        System.out.println("Enter the size of col");
        col = sc.nextInt();
		int name[][] = new int[row][col];
		
        System.out.println("Enter " + row * col + " numbers:");
        int i, j;
        //this is normal for loop statement and line of code are slightly big
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                name[i][j] = sc.nextInt();
            }
        }
        //this part is for each loop we using for make line of code are shorter 
        for(int val[] : name) {
    		Arrays.sort(val);
        	for(int newval : val) {
        		System.out.print(newval+" ");
        	}
        }
	}

}
