import java.util.*;
class main
{
 public static int spy(int n)
 {
 int pro=1,s;
 while(n>0)
 {
 s=n%10;
 pro=pro*s;
 n=n/10;
 }
 return pro;
 }
 public static int upma(int x)
 {
 int sum=0,s;
 while(x>0)
 {
 s=x%10;
 sum=sum+s;
 x=x/10;
 }
 return sum;
 }
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int n,upma,tea;
 n=sc.nextInt();
 upma=spy(n);
 tea=upma(n);
 if(upma==tea)
 System.out.println("Spy Number" );
 else
 System.out.println("Not Spy Number" );
 }
}