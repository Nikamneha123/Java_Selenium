package constructor;

public class Userdefinecon {
	int Num1;       //1.variable initialise
	int Num2;

	public  Userdefinecon(){//without para
		//variabledecl
		Num1=10;
		Num2=20;
		int add=Num1+Num2;
		System.out.println(add);
		
		
	}
	public  Userdefinecon(int a,int b) {
		
		Num1=a;
		Num2=b;
		int add=Num1+Num2;
		System.out.println(add);
		
		
	}
	public void addition() {
		int sum=Num1+Num2;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		 Userdefinecon UD=new  Userdefinecon();
		// Userdefinecon UD1=new  Userdefinecon();
		// UD.addition();
		 
	}
	
}
