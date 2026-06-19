import java.util.Scanner;
class Swiggy 
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\t\t\t Welcome to Swiggy!");
		System.out.println("Select your Restaurant");
		System.out.println("1.A2B\n2.SS.Hyderabad\n3.Yaa Mohideen");
		System.out.print("Enter any one option:");
		int op=sc.nextInt();
		
		switch(op){
			case 1:System.out.println("\t\t\t\t\tWelcome to A2B");
			       System.out.println("Menucard");
				   System.out.println("1.Dosa\n2.Sambhar Vada\n3.Full Meals");
				   System.out.print("Enter your dish:");
				   int dish11=sc.nextInt();
				   switch(dish11){
					      case 1:System.out.println("You selected Dosa");
						         System.out.print("Enter your Quantity:");
								 int price1=100;
								 int quantity1=sc.nextInt();
								 int bill1=quantity1*price1;
								 System.out.println("Your Bill Amount is:"+bill1);
								 System.out.print("Want to take the order?\n Enter 'Y' if Yes,Enter 'N' if No:");
								 char tn1=sc.next().charAt(0);
								 if(tn1=='Y')
								 {
									System.out.print("Enter your amount:");
									int amt1=sc.nextInt();
									if(amt1==bill1)
									{
										int gotp=(int)(Math.random() *9000)+1000;
										System.out.println("Your Otp is:"+gotp);
										System.out.print("Enter your otp:");
										int otp=sc.nextInt();
										if(gotp==otp){
											System.out.println("Your Order is Placed,It will be in your Hand Little shortly...");	
										}
										else{
											System.out.print("Invalid OTP");
										}
								    }
									else
										{
											System.out.println("Payment is failed");
										}
								 
								 }
								 else{
									System.out.println("Order process terminated...");
								 }
						         break;
						  case 2:System.out.println("You selected Sambhar Vada");
						         System.out.print("Enter your Quantity:");
								 int price2=100;
								 int quantity2=sc.nextInt();
								 int bill2=quantity2*price2;
								 System.out.println("Your Bill Amount is:"+bill2);
								 System.out.print("Want to take the order?\n Enter 'Y' if Yes,Enter 'N' if No:");
								 char tn2=sc.next().charAt(0);
								 if(tn2=='Y')
								 {
									System.out.print("Enter your amount:");
									int amt2=sc.nextInt();
									if(amt2==bill2)
									{
										int gotp=(int)(Math.random() *9000)+1000;
										System.out.println("Your Otp is:"+gotp);
										System.out.print("Enter your otp:");
										int otp=sc.nextInt();
										if(gotp==otp){
											System.out.println("Your Order is Placed,It will be in your Hand Little shortly...");	
										}
										else{
											System.out.print("Invalid OTP");
										}
								    }
									else
										{
											System.out.println("Payment is failed");
										}
								 
								 }
								 else{
									System.out.println("Order process terminated...");
								 }
						         break;
						  case 3:System.out.println("You selected Full Meals");
						         System.out.print("Enter your Quantity:");
								 int price3=175;
								 int quantity3=sc.nextInt();
								 int bill3=quantity3*price3;
								 System.out.println("Your Bill Amount is:"+bill3);
								 System.out.print("Want to take the order?\n Enter 'Y' if Yes,Enter 'N' if No:");
								 char tn3=sc.next().charAt(0);
								 if(tn3=='Y')
								 {
									System.out.print("Enter your amount:");
									int amt3=sc.nextInt();
									if(amt3==bill3)
									{
										int gotp=(int)(Math.random() *9000)+1000;
										System.out.println("Your Otp is:"+gotp);
										System.out.print("Enter your otp:");
										int otp=sc.nextInt();
										if(gotp==otp){
											System.out.println("Your Order is Placed,It will be in your Hand Little shortly...");	
										}
										else{
											System.out.print("Invalid OTP");
										}
								    }
									else
										{
											System.out.println("Payment is failed");
										}
								 
								 }
								 else{
									System.out.println("Order process terminated...");
								 }
						         break;
						  default:System.out.println("Invalid option");
				   }
				   break;
			case 2:System.out.print("Welcome to SS.Hyderabad");
			       System.out.println("Menucard");
				   System.out.println("1.Mutton Biriyani\n2.Chicken Biriyani\n3.Tandoori");
				   System.out.print("Enter your dish:");
				   int dish21=sc.nextInt();
				   switch(dish21){
					      case 1:System.out.println("You selected Mutton Biriyani");
						         System.out.print("Enter your Quantity:");
								 int price4=300;
								 int quantity4=sc.nextInt();
								 int bill4=quantity4*price4;
								 System.out.println("Your Bill Amount is:"+bill4);
								 System.out.print("Want to take the order?\n Enter 'Y' if Yes,Enter 'N' if No:");
								 char tn4=sc.next().charAt(0);
								 if(tn4=='Y')
								 {
									System.out.print("Enter your amount:");
									int amt4=sc.nextInt();
									if(amt4==bill4)
									{
										int gotp=(int)(Math.random() *9000)+1000;
										System.out.println("Your Otp is:"+gotp);
										System.out.print("Enter your otp:");
										int otp=sc.nextInt();
										if(gotp==otp){
											System.out.println("Your Order is Placed,It will be in your Hand Little shortly...");	
										}
										else{
											System.out.print("Invalid OTP");
										}
								    }
									else
										{
											System.out.println("Payment is failed");
										}
								 
								 }
								 else{
									System.out.println("Order process terminated...");
								 }
						         break;
						  case 2:System.out.println("You selected Chicken biriyani");
						         System.out.print("Enter your Quantity:");
								 int price5=180;
								 int quantity5=sc.nextInt();
								 int bill5=quantity5*price5;
								 System.out.println("Your Bill Amount is:"+bill5);
								 System.out.print("Want to take the order?\n Enter 'Y' if Yes,Enter 'N' if No:");
								 char tn5=sc.next().charAt(0);
								 if(tn5=='Y')
								 {
									System.out.print("Enter your amount:");
									int amt5=sc.nextInt();
									if(amt5==bill5)
									{
										int gotp=(int)(Math.random() *9000)+1000;
										System.out.println("Your Otp is:"+gotp);
										System.out.print("Enter your otp:");
										int otp=sc.nextInt();
										if(gotp==otp){
											System.out.println("Your Order is Placed,It will be in your Hand Little shortly...");	
										}
										else{
											System.out.print("Invalid OTP");
										}
								    }
									else
										{
											System.out.println("Payment is failed");
										}
								 
								 }
								 else{
									System.out.println("Order process terminated...");
								 }
						         break;
						  case 3:System.out.println("You selected Tandoori");
						         System.out.print("Enter your Quantity:");
								 int price6=200;
								 int quantity6=sc.nextInt();
								 int bill6=quantity6*price6;
								 System.out.println("Your Bill Amount is:"+bill6);
								 System.out.print("Want to take the order?\n Enter 'Y' if Yes,Enter 'N' if No:");
								 char tn6=sc.next().charAt(0);
								 if(tn6=='Y')
								 {
									System.out.print("Enter your amount:");
									int amt6=sc.nextInt();
									if(amt6==bill6)
									{
										int gotp=(int)(Math.random() *9000)+1000;
										System.out.println("Your Otp is:"+gotp);
										System.out.print("Enter your otp:");
										int otp=sc.nextInt();
										if(gotp==otp){
											System.out.println("Your Order is Placed,It will be in your Hand Little shortly...");	
										}
										else{
											System.out.print("Invalid OTP");
										}
								    }
									else
										{
											System.out.println("Payment is failed");
										}
								 
								 }
								 else{
									System.out.println("Order process terminated...");
								 }
						         break;
						        
						  default:System.out.println("Invalid option");
				   }
				    break;
		    case 3:System.out.print("Welcome to Yaa Mohideen");
			        System.out.println("Menucard");
				   System.out.println("1.Hyderabad chicken biriyani\n2.Seeraga samba Mutton biriyani\n3.Grill");
				   System.out.print("Enter your dish:");
				   int dish31=sc.nextInt();
				   switch(dish31){
					      case 1:System.out.println("You selected Hyderabad chicken biriyani");
						         System.out.print("Enter your Quantity:");
								 int price7=150;
								 int quantity7=sc.nextInt();
								 int bill7=quantity7*price7;
								 System.out.println("Your Bill Amount is:"+bill7);
								 System.out.print("Want to take the order?\n Enter 'Y' if Yes,Enter 'N' if No:");
								 char tn7=sc.next().charAt(0);
								 if(tn7=='Y')
								 {
									System.out.print("Enter your amount:");
									int amt7=sc.nextInt();
									if(amt7==bill7)
									{
										int gotp=(int)(Math.random() *9000)+1000;
										System.out.println("Your Otp is:"+gotp);
										System.out.print("Enter your otp:");
										int otp=sc.nextInt();
										if(gotp==otp){
											System.out.println("Your Order is Placed,It will be in your Hand Little shortly...");	
										}
										else{
											System.out.print("Invalid OTP");
										}
								    }
									else
										{
											System.out.println("Payment is failed");
										}
								 
								 }
								 else{
									System.out.println("Order process terminated...");
								 }
						         break;
						  case 2:System.out.println("You selected Seeraga samba Mutton biriyani");
						          System.out.print("Enter your Quantity:");
								 int price8=190;
								 int quantity8=sc.nextInt();
								 int bill8=quantity8*price8;
								 System.out.println("Your Bill Amount is:"+bill8);
								 System.out.print("Want to take the order?\n Enter 'Y' if Yes,Enter 'N' if No:");
								 char tn8=sc.next().charAt(0);
								 if(tn8=='Y')
								 {
									System.out.print("Enter your amount:");
									int amt8=sc.nextInt();
									if(amt8==bill8)
									{
										int gotp=(int)(Math.random() *9000)+1000;
										System.out.println("Your Otp is:"+gotp);
										System.out.print("Enter your otp:");
										int otp=sc.nextInt();
										if(gotp==otp){
											System.out.println("Your Order is Placed,It will be in your Hand Little shortly...");	
										}
										else{
											System.out.print("Invalid OTP");
										}
								    }
									else
										{
											System.out.println("Payment is failed");
										}
								 
								 }
								 else{
									System.out.println("Order process terminated...");
								 }
						         break;
						  case 3:System.out.println("You selected Grill");
						         System.out.print("Enter your Quantity:");
								 int price9=450;
								 int quantity9=sc.nextInt();
								 int bill9=quantity9*price9;
								 System.out.println("Your Bill Amount is:"+bill9);
								 System.out.print("Want to take the order?\n Enter 'Y' if Yes,Enter 'N' if No:");
								 char tn9=sc.next().charAt(0);
								 if(tn9=='Y')
								 {
									System.out.print("Enter your amount:");
									int amt9=sc.nextInt();
									if(amt9==bill9)
									{
										int gotp=(int)(Math.random() *9000)+1000;
										System.out.println("Your Otp is:"+gotp);
										System.out.print("Enter your otp:");
										int otp=sc.nextInt();
										if(gotp==otp){
											System.out.println("Your Order is Placed,It will be in your Hand Little shortly...");	
										}
										else{
											System.out.print("Invalid OTP");
										}
								    }
									else
										{
											System.out.println("Payment is failed");
										}
								 
								 }
								 else{
									System.out.println("Order process terminated...");
								 }
						         break;
						  default:System.out.println("Invalid option");
				   }
				    break;
			default:System.out.print("Invalid option");
		}
	}
}
