import java.util.Scanner;
class Palindrome
{
    int n,rev=0,rem=0;
    Palindrome(int x)
    {
        n=x;
        }
    public void palin()
    {
        int originalnum=n;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(originalnum==rev){
        System.out.println("PALINDROME NUMBER");
        }
        else
        {
        System.out.println("NOT A PALINDROME NUMBER");
        }
    }
}
class UsePalindrome
{
    static int a ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Numbers");
        a=sc.nextInt();
        Palindrome cl = new Palindrome(a);
        cl.palin();
    }
}