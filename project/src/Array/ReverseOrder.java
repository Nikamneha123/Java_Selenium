package Array;

public class ReverseOrder {
	
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,67,8,9,5};
		System.out.println(arr.length);
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("Reverse Array");
		for(int j=6;j>0;j--) {
			System.out.println(arr[j]+" ");
		}
		
		
	}
	

}
