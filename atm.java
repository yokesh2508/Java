import java.util.Scanner;
class Atm 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\t ATM");
		System.out.println("1.Display\n2.Deposit\n3.Withdrawl");
		System.out.print("Enter any option:");
		int option=sc.nextInt();
		
		
		int balance=10000;
		int deposit;
		int withdrawl;
		switch(option)
		{
			case 1: System.out.println("We will display your amount");
					System.out.println("Your Balance is:"+balance);
					break;
			case 2: System.out.println("We will display your amount");
					System.out.print("Enter your deposit amount:");
					deposit=sc.nextInt();
					System.out.println("Your Current balance is:"+(balance+deposit));
					break;
			case 3: System.out.println("We will display your amount");
			        System.out.print("Enter your Withdrawl amount:");
					withdrawl=sc.nextInt();
					//String Y=withdrawl>balance? :"Insufficent balance" : continue;
					if (withdrawl<=balance)
					{
						balance=balance-withdrawl;
						System.out.println("withdrawl done successfully");
					}
					else
			         {
						System.out.println("insufficent balance");
					 }
					
					System.out.println("you have :"+balance);
					break;
					
			default:System.out.println("invalid option");		
		}
	}
}
