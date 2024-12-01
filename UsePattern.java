import java.util.Scanner;
class Pattern
{
    int n;
    Pattern(int x)
    {
        n=x;
    }
    public void pat()
    {
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
       }
    }
}
class UsePattern
{
    static int a ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers");
        a=sc.nextInt();
        Pattern cl = new Pattern(a);
        cl.pat();
    }
}