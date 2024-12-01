import java.util.Scanner;
public class Oddarray {
    public static void main(String[] args) {
        int [] arr =new int[1000];
        int sum=0;
        Scanner sc =new Scanner(System.in);
     System.out.println("Enter the array elements") ;
        for(int i=1;i < 10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Odd number in the array");
        for(int x : arr){ 
        if(x % 2 !=0){
            sum =sum+arr[x];
        System.out.println(x +" ");
        }
            }
        System.out.println("SUM OF THE ODD NUMERS="+sum);
}
}