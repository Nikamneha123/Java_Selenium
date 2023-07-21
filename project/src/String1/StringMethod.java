package String1;

public class StringMethod {

	public static void main(String[] args) {
		
		String S1="Velocity";
		
		System.out.println("index---->"+S1.charAt(5));
		
		System.out.println("index---->"+S1.charAt(2));
		
		System.out.println(S1.length());
		//3..equals------to check whether the string is empty or not
		String S2="Velocity";
		
		String S3="Velocity";
		
		String S4=new String("Velocity");
		
		System.out.println(S2.equals(S3));  //true
		
		System.out.println(S2.equals(S4));  //false
		
		//4.isempty-----to check whether the string is empty or not

		String S5="Automation";
		System.out.println(S5.isEmpty());//false
		
		String S6="";
		System.out.println(S6.isEmpty());//true
		
		//5.replace------to check whether the string is replace or not
		
		String S7="Automation";
		System.out.println(S7.replace('A', 'Z'));
		System.out.println(S7.replace('t', 'm'));
		String S8="17 12 1993";
		System.out.println(S8.replace(' ', '/'));  //17/12/1993
		
		//6.Replace all
		String S9="Python java CPP Clasess";
		System.out.println(S9.replaceAll("java CPP", "NEHA"));//python neha classes
		System.out.println(S9.replaceAll(" ",""));//----------
		
        //7.substring
		String S10="Velocity Classes";
		System.out.println(S10.substring(4, 8));
		System.out.println(S10.substring(10, 13));
		System.out.println(S10.substring(2));
		
		//8.INDEXOF
		String S11="OLD IS GOLD";
		System.out.println(S11.indexOf('I'));//1ST OCCURANCE//4
		System.out.println(S11.indexOf('I',S11.indexOf('I')+1));//2ST OCCURANCE
		System.out.println(S11.indexOf('I',S11.indexOf('I')+1)+1);//3RD OCCURANCE
		
		//9.LASTINDEXOF
		String S12="python";
		System.out.println(S12.lastIndexOf('n'));
		
		//10.tolowercase
		String S13="TESTER";
		System.out.println(S13.toLowerCase());
		
		//11.TOUPPERCASE
		String S14="tester";
		System.out.println(S14.toUpperCase());
		
		//12.TRIM
		String S15="    OLD IS GOLD   ";
		System.out.println(S15);
		System.out.println(S15.trim());
		
		//13.SPLIT
		String S16="Hello/world/Test/java";
		String S17[]=S16.split("/");
		for(int i=0;i<S17.length;i++) {
			System.out.println(S17[i]);
		}
		
		String Date="17-12-1993";
		String Date1[]=Date.split("-");
		for(int j=0;j<Date1.length;j++) {
			System.out.println(Date1[j]);
		}
		
		
		
		
		
		
		
}
}
