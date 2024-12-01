import java.util.Scanner;
class Ar
{
    int r;
    Ar(int p)
    {
        r=p;
    }
    public void area()
    {
        double area=Math.PI*r*r;
        System.out.println("AREA OF THE CIRCLE="+ area);
    }
}
class UseAr
{
    static int a ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Radius");
        a=sc.nextInt();
        Ar cl = new Ar(a);
        cl.area();
    }
}