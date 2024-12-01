import java.util.Scanner;
public class TwoDarray
{
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array elements") ;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                
        arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array elements are");
        for (int i = 0; i <= 2; i++) {
            System.out.println(" ");
            for(int j=0;j<=2;j++){
                                System.out.print("\t");
                    System.out.print(arr[i][j]);
            }
            }
    }
}

