import java.util.Scanner;
public class Evenarray {
    public static void main(String[] args) {
        int [] arr =new int[10];
        Scanner sc =new Scanner(System.in);
     System.out.println("Enter the array elements") ;
        for(int i=0;i < 10 ;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Even number in the array");
        for(int x:arr){   
        if(x % 2 ==0){
        System.out.println(x+" ");
        }
    }
}
}
    
    

