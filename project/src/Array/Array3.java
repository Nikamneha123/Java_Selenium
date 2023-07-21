package Array;

public class Array3 {
	public static void main(String[] args) {
		//String str[]=new String[-2];     //no negativeArraySizeException
		String str[]=new String[4];
		str[0]="Neha";
		str[1]="!@##$#@";
		str[3]="Test";
		//str[4]="12345";
		System.out.println(str[2]);
		System.out.println();
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
			
		}
	}

}
