import java.util.Scanner;
class Calc
{
    int x;
    int y;
    Calc(int p,int q)
    {
        x=p;
        y=q;
    }
    public void add()
    {
        int sm=x+y;
        System.out.println("ADDITION IS "+ sm);
    }
     public void sub()
    {
        int sb=x-y;
        System.out.println("SUBTRACTION IS "+ sb);
    }
    public void mul()
    {
        int ml=x*y;
        System.out.println("MULTIPLICATION IS "+ ml);
    }
    public void div()
    {
        int dv=x/y;
        System.out.println("DIVISION IS "+ dv);
    }
}
public class UseCalc 
{
    static int a;
    static int b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number for calculation");
        a=sc.nextInt();
        b=sc.nextInt();
        Calc cl = new Calc(a,b);
        cl.add();
        cl.sub();
        cl.mul();
        cl.div();
    }
}
