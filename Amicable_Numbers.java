import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,sum=0,add=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            sum=sum+i;
        }
        for(i=1;i<b;i++)
        {
            if(b%i==0)
            add=add+i;
        }
        if(a==add && b==sum)
        System.out.print("Amicable");
        else
        System.out.print("Not Amicable");
    }
}