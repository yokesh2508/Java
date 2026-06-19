import java.util.Scanner;
class Bank 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{    
		int option;
		int balance=1000;
		int pin=2508;
		long phno=9361767360L;
		do{
		System.out.println("1.Display Balance \n2.Deposit \n3.Withdrawl \n4.Change Pin \n5.Exit");
		System.out.print("Enter any option:");
	    option=sc.nextInt();
		
		switch(option){
			case 1:System.out.print("Enter your pin:");
			       int userpin=sc.nextInt();
				   if (userpin==pin)
				   {
					System.out.println("Your balance is:"+balance);
				   }else{
					System.out.println("Invalid pin...");
				   }
				   break;
			case 2:System.out.print("Enter your pin:");
			       userpin=sc.nextInt();
				   if(userpin==pin){
					     System.out.print("Enter your deposit amount:");
			             int deposit=sc.nextInt();
				         balance+=deposit;
				         System.out.println("Deposit done succesfully...");
					}
					else{
					    System.out.println("Invalid Pin...");
				   }
				   break;
			case 3:System.out.print("Enter your pin:");
			       userpin=sc.nextInt();
				   if(userpin==pin){
					    System.out.print("Enter your withdrawl amount:");
			       int with=sc.nextInt();
				   if(with<=balance){
					balance-=with;
						System.out.println("Withdrawl done successfully...");
				   }
				   else
			       {
					   System.out.println("Insufficient Balance");
			        }
					
				   }
				   else{
					System.out.println("Invalid Pin...");
				   }
				   break;
			case 4:System.out.print("Enter your phone number:");
			       long userph=sc.nextLong();
				   if(userph==phno){
					     int Otp=(int) (Math.random() *9000)+1000;
						 System.out.println("Your OTP is :"+Otp);
						 System.out.print("Enter your OTP:");
						 int userOTP=sc.nextInt();
						 if(userOTP==Otp){
							    System.out.print("Enter your New Pin:");
								pin=sc.nextInt();
								System.out.println("Your New OTP is updated succesfully...");
						 }else{
							System.out.println("Invalid OTP...");
						 }
				   }else{
					System.out.println("Invalid phone number...");
				   }
				   break;
			case 5:System.out.println("Tata bye bye...");
			       break;
			default:System.out.println("Invalid option");	   
		}
		}while(option!=5);
	}
}
