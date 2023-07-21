package Collection_list;

import java.util.HashSet;

public class HASH_SET2 {
	
	public static void main(String[] args) {
		
		HashSet HS1=new HashSet();//homo
		
		HS1.add(100);
		HS1.add(30);
		HS1.add(40);
		HS1.add(50);
		HS1.add(60);
		
		HashSet HS2=new HashSet();
		HS2.add(100);
		HS2.add(70);
		HS2.add(80);
		HS2.add(60);
		
     	//HS1.addAll(HS2);
		
		//System.out.println(HS1);//DISPLAY ONLY UNIQUE ELEMENT
		
	//	HS1.retainAll(HS2);
		
		//System.out.println(HS1);//DIPLY ONLY COMMON ELEMENT
		
		
		//CONTAINSALL
		
	//	System.out.println(HS1.containsAll(HS2));  //FALSE
		
		//REMOVEALL
		
		HS1.removeAll(HS2);
		System.out.println(HS1);
		
		HS2.removeAll(HS1);
		System.out.println(HS2);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
