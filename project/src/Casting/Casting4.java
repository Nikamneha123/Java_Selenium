package Casting;

public class Casting4 extends Casting3{
	
	public void Demo3() {
		
		System.out.println("Demo3---------Method");
		
		//System.out.println();
	}
public static void main(String[] args) {
	Casting4 C4=new Casting4();//static binding+CP+Early binding
	
	C4.Demo1();
	C4.Demo2();
	C4.Demo3();
	System.out.println();
	
	//UPCASTING
	Casting3 C3=new Casting4();
	C3.Demo1();
	C3.Demo2();
	
	//DOWN CASTING
	Casting4 C41= (Casting4) new Casting3();    //classcastexception
	C41.Demo1();
	C41.Demo2();
	C41.Demo3();
	
	
	
	
}
}
