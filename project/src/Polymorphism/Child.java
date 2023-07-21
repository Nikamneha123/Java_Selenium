package Polymorphism;

public class Child extends Father {
	public void Bike() {
		System.out.println("Bike-----fz");
	}
public void Car(int i) {//method dec
	System.out.println("car -----swift");//method defi
	
}
public static void main(String[] args) {
	Father F1=new Father();
	F1.Money();
	F1.Home();
	F1.Car(10);
	System.out.println();
	
	
	Child C1=new Child();//static poly
	C1.Bike();
	C1.Car(10);
	C1.Home();
	C1.Money();
	System.out.println();
	
	Father F2=new Child();
	F2.Car(10);
	F2.Home();
	F2.Money();
	
	
}
}
