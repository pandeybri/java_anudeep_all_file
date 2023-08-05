package collection_framwork;
import java.util.Scanner;

public class StudentGroups {
    public static void main(String[] args) {
        StudentGroups obj = new StudentGroups();
        obj.findGroup();
    }

    public void findGroup() {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter the student's roll number: ");
            int rollNumber = scanner.nextInt();

            // Calculate the remainder when the roll number is divided by 4
            int remainder = rollNumber % 4;

            // Determine the group based on the remainder
            String group;
            switch (remainder) {
                case 1:
                    group = "Sapphire";
                    break;
                case 2:
                    group = "Perl";
                    break;
                case 3:
                    group = "Ruby";
                    break;
                case 0:
                    group = "Emerald";
                    break;
                default:
                    group = "Unknown"; // This should never happen if the input is a positive integer
            }

            System.out.println("The student belongs to the group: " + group);

            System.out.print("Do you want to check another roll number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}
