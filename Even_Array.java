import java.util.Scanner;
class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        for(i=0;i<n;i++)
         {
             if(x[i]%2==0)
             count++;
         }
      if(count==n) 
      System.out.println("True");
      else
      System.out.println("False");
    }
}