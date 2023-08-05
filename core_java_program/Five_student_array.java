package core_java_program;

import java.util.Scanner;

public class Five_student_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String[] studentNames = new String[5];
        String[] subjectNames = new String[5];
        double[][] marks = new double[5][5];

        // Accept student names
        System.out.println("Enter the names of 5 students:");
        for (int i = 0; i < studentNames.length; i++) {
            studentNames[i] = scanner.nextLine();
        }

        // Accept subject names
        System.out.println("Enter the names of 5 subjects:");
        for (int i = 0; i < subjectNames.length; i++) {
            subjectNames[i] = scanner.nextLine();
        }

        // Accept marks for each subject for each student
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Enter marks for " + studentNames[i] + ":");
            for (int j = 0; j < subjectNames.length; j++) {
                System.out.print(subjectNames[j] + ": ");
                marks[i][j] = scanner.nextDouble();
            }
        }

        // Calculate average and percentage for each student
        System.out.println("Student\tAverage\tPercentage");
        for (int i = 0; i < studentNames.length; i++) {
            double total = 0;
            for (int j = 0; j < subjectNames.length; j++) {
                total += marks[i][j];
            }
            double average = total / subjectNames.length;
            double percentage = (total / (subjectNames.length * 100)) * 100;
            System.out.println(studentNames[i] + "\t" + average + "\t" + percentage + "%");
        }

        scanner.close();

	}

}
