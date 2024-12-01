import java.util.Scanner;
     class OneDarrayoperation {
        public static void main(String[] args) {
            int avg=0,sum=0;
            int[]a=new int[10];
            int min=a[0];
            int max=a[0];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array elemnts");
            for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
            for (int i = 0; i < 10; i++) {
               sum=sum+a[i];
               if(min>a[i])
               min=a[i];
               if(max<a[i]) 
               max=a[i];
               avg=sum/a.length;
            }
                System.out.println("SUM OF THE ARRAY ELEMENTS"+sum);
                System.out.println("AVGERAGE"+avg);
                System.out.println("MAX VALUE"+max);
                System.out.println("MIN VALUE"+min);
        }
      }
