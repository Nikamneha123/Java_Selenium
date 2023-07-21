package String1;

public class StringReverseSen {
	
	public static String ReverseMethod(String Str) {
		String[] Words=Str.split("");
		String result="";
		
		
		for(int i=Words.length-1;i>=0;i--) {
			if(i==0) {  
				
				//else {
				result=result+Words[i]+"";
				
				
			//}
			}
			
		}
		return result;
		
	}
	
	
	
	
	public static void main(String[] args) {
		String Str="Welcome To Velocity";
		
		
		
		
		
	}

}
