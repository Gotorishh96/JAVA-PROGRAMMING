import java.util.Scanner;
class Prime
{
    int n,c=0;
    Prime(int x)
    {
        n=x;
        }
    public void prim()
    {
        int i;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2){
        System.out.println("PRIME NUMBER");
        }
        else
        {
        System.out.println("NOT A PRIME NUMBER");
        }
    }
}
class UsePrime
{
    static int a ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Numbers");
        a=sc.nextInt();
        Prime cl = new Prime(a);
        cl.prim();
    }
}