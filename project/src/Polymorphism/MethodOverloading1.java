package Polymorphism;

public class MethodOverloading1 {
	public static void main(String[] args) {
		MethodOverloading1 M1=new MethodOverloading1();
		M1.Demo1("Java");
		M1.Demo1();
		M1.Demo1(10);
		M1.Demo1(10, 10);
		M1.Demo1(10,10,33.3d);
		
		
		
	}
	public void Demo1() {
		System.out.println("no argument method");
		System.out.println("argument");
	}
	public void Demo1(int i) {
		System.out.println("one i/p argument method");
		
	}
	public void Demo1(int i,int j) {
		System.out.println("two i/p argument method");
	}
	public void Demo1(String h) {
		System.out.println("string i/p argument method");
	}
	public void Demo1(int i,int j,double k) {
		System.out.println("three i/p argument method");
	}
}

