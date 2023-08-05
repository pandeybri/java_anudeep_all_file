package core_java_program;

import java.util.Scanner;

public class Percentage_array {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		student_name();
	}
	
	// Method to accept student names
	public static void student_name() {
		String name[] = new String[5];
		System.out.println("enter name of 5 student : ");
		for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();
        }
		student_subject(name);
		
	}
	
	// Method to accept subject names
	public static void student_subject(String name[]) {
		String sub_name[] = new String[5];
		System.out.println("enter name of 5 subject :");
		for (int i = 0; i < sub_name.length; i++) {
			sub_name[i] = sc.nextLine();
        }
		subject_marks(name, sub_name);
	}
	
	 // Method to accept marks for each subject for each student
	public static void subject_marks(String name[],String sub_name[]) {
		double[][] marks = new double[5][5];
		for (int i = 0; i < name.length; i++) {
            System.out.println("Enter marks for " + name[i] + ":");
            for (int j = 0; j < sub_name.length; j++) {
                System.out.print(sub_name[j] + ": ");
                marks[i][j] = sc.nextDouble();
            }
        }
		avag_perc(name,sub_name,marks);
	}
	
	// Method to calculate average and percentage, and display the result
	public static void avag_perc(String name[],String sub_name[],double marks[][]) {
		System.out.println("\nStudent\tAverage\tPercentage\tGrade");
        for (int i = 0; i < name.length; i++) {
            double total = 0;
            for (int j = 0; j < sub_name.length; j++) {
                total += marks[i][j];
            }
            double average = total / sub_name.length;
            double percentage = (total / (sub_name.length * 100)) * 100;
            char grade;
            if(percentage>=90) {
            	grade = 'O';
            }
            else if(percentage>=80) {
            	grade = 'A';
            }
            else if(percentage>=70){
            	grade = 'B';
            }
            else if(percentage>=60) {
            	grade = 'C';
            }
            else if(percentage>=50) {
            	grade = 'D';
            }
            else if(percentage>=40) {
            	grade = 'E';
            }
            else {
            	grade = 'F';
            }
            System.out.println("\n"+name[i].toUpperCase() + "\t" + average + "\t" + String.format("%.2f",percentage) +"%"+"\t" + grade);
            
        }
		
	}
}
