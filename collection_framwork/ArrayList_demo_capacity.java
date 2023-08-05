package collection_framwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_demo_capacity {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList_demo_capacity obj = new ArrayList_demo_capacity();
		obj.Array();

	}
	
	public void Array() {
		ArrayList<Integer> demo = new ArrayList<>();
		
		while (true) {
            System.out.println("Enter a number (or -1 to stop): ");
            int num = sc.nextInt();

            if (num == -1) {
                break; // Exit the loop if the user enters -1
            }

            demo.add(num);
        }
		Collections.sort(demo);

        System.out.println("Numbers entered: " + demo);

	}

}