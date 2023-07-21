package Exception_Handling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
	System.out.println("Automation");	
	int Num=100;
	
	try {
	//System.out.println(Num/0);
	
	}
	catch(ArithmeticException e) {
		System.out.println("Welcome");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	finally {
		
		System.out.println("this is finally block");
		
		
	}

	}

}
