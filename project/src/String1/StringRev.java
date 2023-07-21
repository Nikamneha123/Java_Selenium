package String1;

public class StringRev {
	
	public static void main(String[] args) {
		
		String Str="Welcome to java and automation";
		
		String Rev=" ";
		
		System.out.println(Str.length());
		
	//	for(int i=Str.length()-1;i>=0;i--) {
		for(int i =Str.length()-1;i>=0;i--) {
		//for(int i=0;i<Str.length();i++) {
			Rev=Rev+Str.charAt(i);
			//Rev=ch+Rev;
			
		//System.out.println(Rev);	
		}
		
		System.out.println("reverse word="  + Rev);
	}

}
