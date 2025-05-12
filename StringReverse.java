import java.util.*;
class StringReverse
{
public static void main(String arg[])
  {
  String s1;
  int i;
  Scanner sc=new Scanner(System.in); 
	 System.out.println("Enter the String:");
	 s1= sc.nextLine(); 
	 System.out.println("Orignal String:"+s1);
	 String reverse="";
	 int len= s1.length();
	 for(i=len-1;i>=0;i--)
	 {
	 reverse=reverse+s1.charAt(i);
	 
	 }
	 System.out.println("Reserved String:"+reverse);
   }
  } 
	 
	 