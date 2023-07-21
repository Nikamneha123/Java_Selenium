package Exception_Handling;

public class ExceptionHandling2 {
	
	public static void main(String[] args) {
		
		System.out.println("program started");
		
		String name=null;
		
		try {
		//System.out.println(name.length());
		}
		catch(ArithmeticException E) {
			System.out.println(E.getMessage());
			E.printStackTrace();
			
		}
		catch(NullPointerException E) {
			System.out.println(E.getMessage());
			E.printStackTrace();
		
	}
		
		int arr[]=new int[10];
		
		try {
			
			arr[11]=100;
			
		}catch(ArrayIndexOutOfBoundsException AE) {
			AE.getMessage();
			AE.printStackTrace();	
		}
		
		
finally {
		System.out.println("PROGRAM COMPLETED");
}
}
}