import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
 char C;
 Scanner sc =new Scanner(System.in);
 C = sc.nextLine().charAt(0);
 if ( C=='A' || C=='E' || C=='I' || C=='O' || C=='U' || C=='a' || C=='e' || C=='i' || C=='o' || C=='u')
 System.out.println("Vowel" );
 else
 System.out.println("Consonant" );
 sc.close(); 
}
}