import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        int a,b,c,x;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        x=2*a*b*c*512;
        System.out.println(x);
    }
}