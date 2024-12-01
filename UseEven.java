import java.util.Scanner;
class Even
{
    int n;
    Even(int x)
    {
        n=x;
        }
    public void odd()
    {
        if(n%2==0)
        {
        System.out.println("EVEN NUMBER");
        }
        else
        {
        System.out.println("ODD NUMBER");
        }
    }
}
class UseEven
{
    static int a ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Numbers");
        a=sc.nextInt();
        Even cl = new Even(a);
        cl.odd();
    }
}