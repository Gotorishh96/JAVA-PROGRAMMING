import java.util.Scanner;

public class TwoDaboveDiagno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        // Create a 2D array with the given rows and columns
        int[][] array = new int[rows][cols];

        // Get the elements of the 2D array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Print the elements above the diagonal
        System.out.println("Elements above the diagonal:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j > i) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}