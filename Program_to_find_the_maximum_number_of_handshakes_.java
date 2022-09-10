import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        int a,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=(n*(n-1))/2;
        System.out.println(a);
    }
}