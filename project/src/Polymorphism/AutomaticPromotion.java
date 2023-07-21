package Polymorphism;

public class AutomaticPromotion {
	public static void main(String[] args) {
		AutomaticPromotion M1=new AutomaticPromotion();
		M1.test1('D');
		M1.test1(333l);
		M1.test1(10d);
		
	}
	public void test1() {
		System.out.println("zero i/p para method");
	}
	public void test1(double d) {
		System.out.println("double i/p para method");
	}
	public void test1(float F) {
		System.out.println("float i/p para method");
	}
	public void test1(long d) {
		System.out.println("long i/p para method");
	}
	

}
