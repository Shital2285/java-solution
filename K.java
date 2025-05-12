import java.util.*;

import java.io.*;

class K
{
  public static void main(String args[])
{
  int i,j,n;
   Scanner sc=new Scanner(System.in);
   System.out.println(" Enter the number");
   n=sc.nextInt();
    for(i=1; i<n;i++)
   {
    
    for(j=i; j<=n; j++)
    {
    System.out.print(" * ");
    }
     System.out.println("");
            
  }

   for(i=0; i<n; i++)
   {
    System.out.print(" * ");
    for(j=1; j<=i; j++)
    {
    System.out.print(" * ");
    }
     System.out.println("");
            
  }

}

}