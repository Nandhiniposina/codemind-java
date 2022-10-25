import java.util.*;
class main
{
    public static boolean pal(int n)
    {
        int t=n,r,rev=0;  
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(t==rev)   
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1=0,d2=0;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(pal(i))
            {
                d2=i;
                break;
            }
        }
        for(int i=n-1;;i--)
        {
            if(pal(i))
            {
                d1=i;
                break;
            }
        }
        if((n-d1)<(d2-n))     
        {
            System.out.println(d1);
        }
        else if((n-d1)>(d2-n))
        {
            System.out.println(d2);
        }
        else
        {
            System.out.println(d1+" "+d2);
        }
        
        
    }
}