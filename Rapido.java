import java.util.Scanner;
class Ride
{
	String PickUp;
	String Drop;
	int distance;
	Ride(String PickUp,String Drop,int distance){
		this.PickUp=PickUp;
		this.Drop=Drop;
		this.distance=distance;
	}
}
class Car extends Ride
{
	int Price=500;
	Car(String PickUp,String Drop,int distance){
		super(PickUp,Drop,distance);
	}
	void carDetails(){
		System.out.println("PickUp is"+PickUp);
		System.out.println("Drop is"+Drop);
		System.out.println("Distance is"+distance+"km");
	}
}
class Bike extends Ride
{
	int Price=200;
	Bike(String PickUp,String Drop,int distance){
		super(PickUp,Drop,distance);
	}
	void bikeDetails(){
		System.out.println("PickUp is"+PickUp);
		System.out.println("Drop is"+Drop);
		System.out.println("Distance is"+distance+"km");
	}
}
class Auto extends Ride
{
	int Price=350;
	Auto(String PickUp,String Drop,int distance){
		super(PickUp,Drop,distance);
	}
	void autoDetails(){
		System.out.println("PickUp is"+PickUp);
		System.out.println("Drop is"+Drop);
		System.out.println("Distance is"+distance+"km");
	}
}
class Rapido 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1.Car \n2.Bike \n3.Auto");
		System.out.print("Enter any one option:");
		int option=sc.nextInt();
		String pickup;
		String drop;
		int dist;
		Ride r=null;
		switch (option)
		{
		case 1:System.out.print("Enter your pickup point:");
		       pickup=sc.nextLine();
			   System.out.print("Enter your drop point:");
		       drop=sc.nextLine();
			   System.out.print("Enter your distance in-between:");
		       dist=sc.nextInt();
			   r= new Car(pickup,drop,dist);
			   break;
		case 2:System.out.print("Enter your pickup point:");
		       pickup=sc.nextLine();
			   System.out.print("Enter your drop point:");
		       drop=sc.nextLine();
			   System.out.print("Enter your distance in-between:");
		       dist=sc.nextInt();
			   r= new Bike(pickup,drop,dist);
			   break;
		case 3:System.out.print("Enter your pickup point:");
		       pickup=sc.nextLine();
			   System.out.print("Enter your drop point:");
		       drop=sc.nextLine();
			   System.out.print("Enter your distance in-between:");
		       dist=sc.nextInt();
			   r= new Auto(pickup,drop,dist);
			   break;
		default:System.out.println("Invalid Option");   
		}
		
	}
}
