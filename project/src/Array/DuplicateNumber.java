package Array;

public class DuplicateNumber {
	
public static void main(String[] args) {
	
	int arr[]= {3,6,5,7,2,7,5,3,2};
	
	System.out.println("Duplicate element in given array");
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]==arr[j]) {
				
				System.out.println(arr[j]+" ");
			}
		}
	}
}
}
