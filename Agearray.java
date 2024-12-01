import java.util.Scanner;
public class Agearray{
    public static void main(String[] args) {
        int under18=0;
        int between18and60=0;
        int above60=0;
        int[] arr=new int[10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the ages");
        for(int i=0;i<arr.length;i++){
        arr[i]=scanner.nextInt();
        }
        for(int age: arr){
           if(age<18)
           under18++;
           else if(age>=18 && age<=60)
           between18and60++;
           else
           above60++;
        }
        System.out.println("Number of people under 18 is:"+under18);
        System.out.println("number of people between 18 and 60 is:"+between18and60);
        System.out.println("Number of people above60 is:"+above60);
    }
}