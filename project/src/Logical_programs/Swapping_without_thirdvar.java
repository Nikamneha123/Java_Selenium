package Logical_programs;

public class Swapping_without_thirdvar {
	
	public static void main(String[] args) {
		
		int a=10,b=20;
		
		System.out.println("before swapping values:"+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping:" +a+" "+b);
		
		
		
		
	}

}
