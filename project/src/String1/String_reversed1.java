package String1;

public class String_reversed1 {
	public static void main(String[] args) {
		
		String Str="Hello good morning";
		String Rev=" ";
		System.out.println(Str.length());
	
		
		for(int i=Str.length()-1;i>=0;i--) {
			Rev=Rev+Str.charAt(i);
			
		}
		
		System.out.println("String reversed----------" +Rev);
		
		
		
	}

}
