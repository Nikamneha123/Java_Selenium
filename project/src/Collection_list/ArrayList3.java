package Collection_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
		
		String arr[]= {"neha","nehaa","neha11"};
		
		
		for(String name:arr) {
			
			System.out.println(name);
			
			
		}
		
		//convert array into arraylist
		
		
		ArrayList AL=new ArrayList(Arrays.asList(arr));
		
		System.out.println(AL);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
