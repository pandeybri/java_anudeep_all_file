package core_java_anudeep;
import java.util.Scanner;
public class Vowel_check {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("enter Char : ");
		char ch = sc.next().charAt(0);
		
		ch = Character.toLowerCase(ch);
		
		if(ch == 'a'|| ch == 'e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(ch+" is a vowel.");
		}
		else {
			System.out.println(ch+" is not a vowel.");
		}

	}

}
