package Polymorphism;

public class Son extends Father {
	public void Bike() {
		System.out.println("Bike-----FZ");
		
	}
	@Override
	public void Car() {
		System.out.println("Car Baleno");
		
		
	}
	@Override
	public void Home() {
		System.out.println("Home----->bhks");
		
	}
	public static void main(String[] args) {
Parent P1=new Parent();
P1.Money();
P1.Car();
P1.Home();
P1.Test();
System.out.println();
Son S1=new Son();
S1.Bike();
S1.Car();
S1.Home();
S1.Money();
System.out.println();


Son P2=new Son();
P2.Car();
P2.Home();
P2.Money();



	}
	
	
	
	

}
