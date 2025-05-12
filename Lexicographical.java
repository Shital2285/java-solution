import java.util.*;
  public class  Lexicographical
{
 public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
 int n=sc.nextInt();
 int n,unit,tens;
 unit=num%10;
 n=num/10;
 tens=n%10;
 if(tens<unit)
 {
 n=n/10;
 n=(n*10)+unit;
 n=(n*10)+tens;
 System.out.println("next hexgrophical number is "+n);
 }
}