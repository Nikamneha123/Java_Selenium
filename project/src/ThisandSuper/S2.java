package ThisandSuper;

public class S2 extends S1{
	
int b=20;//global var
public void m1() {
	
	int b=30;//local var
	
	System.out.println(b);//30
	System.out.println(this.b);//20
	System.out.println(super.b);//10
}

public static void main(String[] args) {
	S2 s=new S2();
	s.m1();
}
}
