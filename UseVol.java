import java.util.Scanner;
class Vol
{
    int r;
    Vol(int p)
    {
        r=p;
    }
    public void volume()
    {
        double volume=4/3*Math.PI*r*r*r;
        System.out.println("VOLUME OF THE SPHERE="+ volume);
    }
}
class UseVol
{
    static int a ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Radius");
        a=sc.nextInt();
        Vol cl = new Vol(a);
        cl.volume();
    }
}