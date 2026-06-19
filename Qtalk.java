import java.util.Scanner;

class Qtalk 
{
	static Scanner sc=new Scanner(System.in);
	String username;
	String email;
	int password;
	long phNO;
	static{
		System.out.println("\t\t\t\tWElcome to Qtalk");
	}
	Qtalk(String username,String email,int password,long phNO){
		this.username=username;
		this.email=email;
		this.password=password;
		this.phNO=phNO;
	}
	void userdetails(){
		System.out.println(username);
		System.out.println(email);
		System.out.println(password);
		System.out.println(phNO);
	}
	void login(long phNO,int password){
		if(this.phNO==phNO && this.password==password){
			System.out.println("\t\t\t\tLogin done successfully...");
		}
		else{
			System.out.println("\t\t\t\tWrong credentials...");
		}
	}
	void login(String email,int password){
		if(this.email.equals(email) && this.password==password){
			System.out.println("\t\t\t\tLogin done successfully...");
		}
		else{
			System.out.println("\t\t\t\tWrong credentials...");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		int op;
		Qtalk user1=null;
		String loginemail;
		int loginpassword;
		long loginphNO;
		
		do{
		System.out.println("1.Signup \n2.Login by phoneNO \n3.Login by email \n0.Exit");
		System.out.print("\t\t\t\tEnter any one option:");
		op=sc.nextInt();
		
		
		
		switch(op){
			case 1:System.out.print("Enter your name:");
			       String signupName=sc.next();
				   System.out.print("Enter your email:");
			       String signupemail=sc.next();
				   System.out.print("Enter your password:");
			       int signupPassword=signupPassword=sc.nextInt();
				   System.out.print("Enter your phNO:");
			       long signupPhNO=sc.nextLong();
				   user1 =new Qtalk(signupName,signupemail,signupPassword,signupPhNO);
				   System.out.println("\t\t\t\tSignup done Successfully...");
				   break;
			case 2:System.out.print("Enter your PhNO:");
			       loginphNO=sc.nextLong();
				   System.out.print("Enter your password:");
			       loginpassword=sc.nextInt();
				   user1.login(loginphNO,loginpassword);
				   break;
		    case 3:System.out.print("Enter your Email:");
			       loginemail=sc.next();
				   System.out.print("Enter your password:");
			       loginpassword=sc.nextInt();
				   user1.login(loginemail,loginpassword);
				   break;
			
		}
		}while(op!=0);
		
		
		//Qtalk user1=new Qtalk("raghul","r15@gmail.com",1234,987654321L);
		//user1.userdetails();
	}
}
