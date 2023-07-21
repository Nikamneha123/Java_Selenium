package Array;

public class LargestNumber {
	public static void main(String[] args) {
		
		int arr[]= {1234,6543,87645,87446,33444};
		
		System.out.println(arr.length);
		
		int maximum=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>maximum) {
				maximum=arr[i];
			}
		}
		System.out.println("largest numbr of given array is-------"  +maximum);
		
	}

}
