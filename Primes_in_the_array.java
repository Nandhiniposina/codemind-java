import java.util.*;
class main
{
    public static int prime(int n) 
    {
        int count=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
         } 
            if(count==1)
                {
                    return 1; 
                     }
                     
                     else
                     {
                         return 0;
                         }
        
    }
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        int n,x[],c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++) 
        { 
            x[i]=sc.nextInt(); 
          if(prime(x[i])==1)
          { 
              c=c+1; 
    
          }
        } 
System.out.println(c);
        }
    }