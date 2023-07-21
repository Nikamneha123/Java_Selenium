package Array;

public class ArraySUM {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(arr.length);
		int SUM=0;
		for(int i=0;i<arr.length;i++) {
			SUM=SUM+arr[i];
			//System.out.println("sum of all elements----------"+SUM);
		}
		
		
		System.out.println("sum of all elements----------"+SUM);
	}
}
