
package Array;

public class Array1 {
	public static void main(String[] args) {
		
	
		//1 array declaration
		//syntax:
		//	datatype arrayname[]=new datatype[arraysize];
		int arr[]=new int[10];
		
		
		//2.array initialization
		//arrayname[indexnumber]
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		arr[7]=80;
		arr[8]=90;
		arr[9]=100;
		//arr[20]=400;   array index out of bound excetion
		System.out.println();
		System.out.println(arr.length);
		System.out.println("Index 5---------"+arr[5]);//60
		System.out.println("Index 5---------"+arr[7]);//80
		System.out.println("Index----"+arr[9]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
