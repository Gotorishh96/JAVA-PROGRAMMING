import java.util.Scanner;
public class TwoDRowCol{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        
        int[][] array = new int[rows][cols];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

System.out.println("First row:");
for (int j = 0; j < cols; j++) {
    System.out.print(array[0][j] + " ");
}

        
        System.out.println("\nLast column:");
        for (int i = 0; i < rows; i++) {
            System.out.println(array[i][cols-1]);
        }
    }
}
