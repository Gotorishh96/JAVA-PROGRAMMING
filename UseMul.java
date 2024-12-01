import java.util.Scanner;
class Mul
{
    int n;
    Mul(int m)
    {
        n=m;
    }
    public void table()
    {
        System.out.println("Multiplication Table is");
        for(int i=1;i<=10;i++)
        {
            int z=n*i;
            System.out.println(n+"*"+i+"="+z);
        }
    }
}
class UseMul
{
    static int a;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        a=sc.nextInt();
        Mul cl = new Mul(a);
        cl.table();
    }
}