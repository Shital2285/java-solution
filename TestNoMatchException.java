import java.util.*;
class TestNoMatchException
{
 public static void main(String arg[]) 
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the string");
 String str=sc.nextLine();
 try
 {
  if(str.equals("India"))
  {
  System.out.println("string Matched");
  }
  else
  {
  throw new NoMatchException("string is not matched with india");
  }
 }
  catch(NoMatchException me)
  {
	System.out.println("custom Exception thrown");  
	System.out.println(me.getMessage());
  }
  
 

 }

}