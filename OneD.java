import java.util.Scanner;
class OneD
{
    public static void main(String[] args) {
        int [] arr =new int[10];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array elements") ;
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        System.out.println("entered elemnts");
        for (int i = 0; i < arr.length; i++) 
        System.out.println("Elements"+i+" "+arr[i]);
    }
}