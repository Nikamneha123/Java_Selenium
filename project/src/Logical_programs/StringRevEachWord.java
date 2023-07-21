package Logical_programs;

public class StringRevEachWord {

	public static void main(String[] args) {
		
		String str="hello good morning";
		

        String [] word = str.split(" ");
		
		String RevS = "";
		
		for (String w : word) {
			String stringword = "";
			
			for (int i =w.length()-1; i>=0; i--) {
				stringword = stringword + w.charAt(i);
			}
			RevS = RevS + stringword+" ";
		}
		System.out.println(RevS);
	}
		
		
		/*
		 String str="hello good morning"
		 String word[]=str.split(" ");
		 Strin rev="";
		 
		 for(String W:word){	
		 String stringwod="";
		 for(inti=W.length-1;i>=0;i++){
		 
		 stringword=stringeord+W.charAt(i);
		 
		 }	 
		 Rev=Rev+Stringword+"";
		 
		 
		 */
	
		
		

		
		
	}
	
	
	
	
	
