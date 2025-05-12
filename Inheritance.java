import java.util.*;
class Inheritance
{
   int num1,num2;
  Scanner sc=new Scanner(System.in);
   void accpet()
   {
  System.out.print("enter the first number:");
  num1=sc.nextInt();
  System.out.print("enter the secod number:");
  num2=sc.nextInt();
  }
}
 class Derived extends Inheritance
 {
	Scanner sc=new Scanner(System.in);
	 int num3;
	 void getThirdNo()
	 {
	 System.out.print("enter the third  number:");
     num3=sc.nextInt();
	 }
	 void dispMax()
	 {
		 if(num1>=num2 && num1>=num3)
		 {
			System.out.println("Maximum number="+num1);  
		 }
		 else if(num2>=num1 && num2>=num3)
		 {
			System.out.println("Maximum number="+num2);  
		 }
		 else{
			 
			System.out.println("Maximum number="+num3);
		 } 
	 }
	 
	 void dispMin()
	 {
		 if(num1<=num2 && num1<=num3)
		 {
			System.out.println("Minimum number="+num1);  
		 }
		 else if(num2<=num1 && num2<=num3)
		 {
			System.out.println("Minimum number="+num2);  
		 }
		 else{
			 
			System.out.println("Minimum number="+num3);
		 } 
	 }
	 void equal()
	 {
		 if(num1==num2 && num2==num3)
		 {
			 System.out.println("all number are equal"); 
		 }
		  else if(num1==num2)
		 {
			System.out.println("num1 and num2 are equal"); 
		 }
		 else if (num1==num3)
		 {
			System.out.println("num1 and num3 are equal");  
		 }
		 else
		 {
			System.out.println("number are not equal"); 
		 }
	 } 
 }
