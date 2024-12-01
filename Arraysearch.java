import java.util.Scanner;
public class Arraysearch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 10 array elements");
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int number =sc.nextInt();
        boolean found=false;
        for (int i = 0; i < 10; i++) {
            if(arr[i]==number){
                System.out.println("NUMBER TO BE SEARCHED "+ number + "FOUND AT POSITION "+(i));
            }
        }
            if(!found){
                System.out.println("NUMBER TO BE SEARCHED "+ number + " NOT FOUND IN THE ARRAY");
            }
        }
    }