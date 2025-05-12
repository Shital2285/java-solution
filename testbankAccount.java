import java.util.*;
class testbankAccount
{
public static void main(String arg[])
  {
	 int ch,pin,i;
	 String Orignal_pin;
	 
	 
	 scanner sc=new Scanner(System.in);
	 Orignal_pin="Pass@123";
	 System.out.println("enter the pin");
	 sc.nextInt();
     
	 {
		 if(Orignal_pin==pin)
		 {
		 Sysytem.out.println("login Successfully");
		 
	 }	
	 else
	 {
		 
			 Sysytem.out.println(" invalid pin");
			 scanner sc=new Scanner(System.in);
			 for(i=1;i<=3;i++){
			 if(pin!==Orignal_pin)
			 {
				Sysytem.out.println(" enter the pin"); 
				sc.nextInt();
				Sysytem.out.println(" yourpin is invalid"); 
			 }
		 }
	 }
	 }	 
	 
	 
	 bankAccount ba=new bankAccount();
	 do 
	 {  
     System.out.println("\n ***Banking System Application***");  
     System.out.println("\n 1. Deposite \n 2. Withdraw \n 3. Display  \n 4. Exit ");  
	 Scanner sc=new Scanner(System.in); 
	 System.out.println("Enter your choice:");
	 ch = sc.nextInt(); 
     switch(ch)	
     {
		                                                                                                                                                                                                                               
		case 1: ba.deposit();
		break;
		case 2: ba.withdraw();
		break;
		case 3: ba.display();
		break;
		case 4: System.out.println("EXIT");
		
		
	  }	 
	 }while(ch!=4);
	  
  }
  
}
