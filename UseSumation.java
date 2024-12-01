import java.util.Scanner;
class Sumation
{
    int n,sum=0,rem=0;
    Sumation(int x)
    {
        n=x;
        }
    public void summ()
    {
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("SUM OF THE EACH NUMBERS="+sum);
    }
}
class UseSumation
{
    static int a ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Numbers");
        a=sc.nextInt();
        Sumation cl = new Sumation(a);
        cl.summ();
    }
}