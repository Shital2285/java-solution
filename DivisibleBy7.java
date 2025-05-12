import java.util.*;
import java.io.*;

  class DivisibleBy7 
 {
 public static void main(String args[])
 {
 int sum = 0;
 int count = 0;
 for (int i = 101; i < 200; i++)
 {
     if (i % 7 == 0)
     {
         sum = sum + i;
         count++;
     }
 }
     System.out.println(" Sum: "+sum);
      System.out.println(" Total number:"+count);
 }
 } 