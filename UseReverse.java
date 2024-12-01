import java.util.Scanner;
class Reverse
{
    int n,rev=0,rem=0;
    Reverse(int x)
    {
        n=x;
        }
    public void revv()
    {
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println("REVERSE OF THE NUMBER="+rev);
    }
}
class UseReverse
{
    static int a ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Numbers");
        a=sc.nextInt();
        Reverse cl = new Reverse(a);
        cl.revv();
    }
}