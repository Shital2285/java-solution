
import java.util.*;
import java.io.*;

class Triangle3
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
        for(space=i;space<row;space++)
		{
		 System.out.print(" ");	
			
		}
		 for (j=0;j<=i;j++)
		 {
			 System.out.print("* ");
			 
		 }
		 System.out.println(" ");
	 }
}
}	