package core_java_anudeep;
import java.util.Arrays;
import java.util.Scanner;

public class Multidimension_array_demo {

    int row, col;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Multidimension_array_demo obj = new Multidimension_array_demo();
        obj.arr_demo();
    }

    public void arr_demo() {
        System.out.println("Enter the size of row");
        row = sc.nextInt();
        System.out.println("Enter the size of col");
        col = sc.nextInt();

        // create the array
        int[][] arr = new int[row][col];
        System.out.println("Enter " + row * col + " numbers:");
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < row; i++) {
            Arrays.sort(arr[i]);
        }

        System.out.println("ascending order: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
