package constructor;

public class default_constructor {
	
	
	
	public static void main(String[] args) {
		default_constructor d1=new default_constructor();
	//	default_constructor d2=new default_constructor();
		d1.addition();
		d1.M1();
		
		
	}
public void M1() {
	System.out.println("hello");
}
public void addition() {
	int i=10;
	int j=20;
	int k=i+j;
	System.out.println(k);
}
}
