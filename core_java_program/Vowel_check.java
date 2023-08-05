package core_java_program;
import java.util.Scanner;
public class Vowel_check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
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
