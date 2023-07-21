package String1;

public class Reverse_String {
public static void main(String[] args) {
	
	new Reverse_String().Reverse();
}
	public void Reverse() {
		String S="Welcome to java and automation";
		
		String str[]=new String[15];
		int count=0;
		str[1]="";
		str[2]="";
		str[3]="";
		str[4]="";
		str[5]="";
		str[6]="";
		
		for(int k=0;k<S.length();k++) {
			if(S.charAt(k)== ' ') {
				count++;
			}
			else {
				str[count]=str[count]+S.charAt(k);
			}
		}
	System.out.println(str[6]+" "+str[5]+" "+str[4]+" "+str[3]+" "+str[2]+" "+str[1]);	
	}
	
	
	
	
}
