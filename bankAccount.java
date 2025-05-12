import java.util.*;
class  bankAccount
{
  String name;
  int acc_No;
  String type;
  Double balance;
  Double amt;
  Scanner sc=new Scanner(System.in);
  bankAccount()
  
  {
	
    System.out.println("Enter Name Of  Depositor:");
    name=sc.nextLine(); 
    System.out.println("Enter account number:");
    acc_No=sc.nextInt();
    System.out.println("Enter account Type:");
    type=sc.next();
    System.out.println("Enter Balance amount in account:");
    balance=sc.nextDouble(); 	
	  
  }
  void display()
  {
	System.out.println(" Name Of  Depositor:"+name);
   
    
    System.out.println("Balance amount in account:"+balance);	
  }
  void deposit()
  {
	  
	   
      System.out.println("Enter the amount you want to deposit: ");  
      amt = sc.nextDouble();  
      balance = balance + amt; 
      System.out.println(" After Adding deposit balance is:"+balance);	  
  }
  void withdraw()
  {
	     
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextDouble();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        }
		else
	    {  
            
			System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
  }
 
  public static void main(String arg[])
  {
	 int ch;
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