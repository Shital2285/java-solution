import java.util.*;
class Biscuit
{
  
  Scanner sc=new Scanner(System.in);
  String Company;
	String name;
  void accpet()
   {
   
	System.out.print("enter the name:");
     name=sc.nextLine();
	 System.out.print("enter the Company name:");
     Company=sc.nextLine();
  
  }
}
   class Dealer extends Biscuit
  {
	  
	 
      Scanner sc=new Scanner(System.in);
	  String  product_name;
	  double price;
	  void getData()
	  {
	  System.out.print("enter the product name:");
      product_name= sc.nextLine();
      System.out.print("enter price:");
      price=sc.nextDouble();
	  }
  
  }
     class Retailer extends Dealer
	 {
     double sell_price;
      void total()
    {
     sell_price=price+(price*0.025);
    }
   void display()
   { 
      System.out.println(" name:"+name);
      System.out.println("company name:"+Company);
      System.out.println("product name:"+product_name);
      System.out.println(" price:"+price);
	  System.out.println(" selling price:"+sell_price);
   }
 }


 
	 