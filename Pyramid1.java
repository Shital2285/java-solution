
import java.util.*;
import java.io.*;

class Pyramid1
{
  public static void main(String args[])
  {
	 Scanner sc=new Scanner(System.in);
	 int row;
	 int i,j;
	 int space;
	 System.out.println("enter the rows");
	 row=sc.nextInt();
	 for(i=0;i<row/2+1;i++)
	 {
        for(space=i;space<row/2;space++)
		{
		 System.out.print(" ");	
			
		}
		 for (j=0;j<=i;j++)
		 {
			 System.out.print("* ");
			 
		 }
		 System.out.println(" ");
	 }
	 //System.out.println("second pyramid");
	 for(i=0;i<row/2;i++)
	 {
        for(space=0;space<=i;space++)
		{
		 System.out.print(" ");	
			
		}
		 for (j=0;j<row/2-i;j++)
		 {
			 System.out.print("* ");
			 
		 }
		 System.out.println(" ");
	 }
	
	 }
	 
  }

