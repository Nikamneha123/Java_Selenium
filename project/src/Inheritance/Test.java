package Inheritance;

public class Test {
	public static void main(String[] args) {
		Son S1=new Son();
		S1.Bike();
		S1.Home();
		S1.Money();
		S1.Car();
		System.out.println();
		Father F1=new Father();
		F1.Car();
		F1.Home();
		F1.Money();
	}

}
