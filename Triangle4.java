
import java.util.*;
import java.io.*;

class Triangle4
{
  public static void main(String args[])
  {
	 Scanner sc=new Scanner(System.in);
	 int row;
	 int i,j;
	 int space;
	 System.out.println("enter the rows");
	 row=sc.nextInt();
	 for(i=0;i<row;i++)
	 {
        for(space=0;space<=i;space++)
		{
		 System.out.print(" ");	
			
		}
		 for (j=0;j<row-i;j++)
		 {
			 System.out.print("* ");
			 
		 }
		 System.out.println(" ");
	 }
}
}	