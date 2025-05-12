import java.util.*;
import java.io.*;
class Palindrome
{
 public static void main(String args[])
 {
	 for(i=1;i<=100000;i++)
	 {
		p.checkPalindrome(i*i);
	 }
 }
 void checkPalindrome(int n)
  
 {   
     int rev=0;rem;
	 int original=n;
	 while(n>0)
	 {
	 rem=n%10;
	 rev(rev*10)+rem;
	 n=n/10;
	 }

     if(rev==original)
	 {
		 System.out.println("palindrome square"+original);
	 }
 }
 }
 
	 
 }
  	 
 
	 
}