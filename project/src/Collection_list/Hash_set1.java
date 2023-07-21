package Collection_list;

import java.util.Iterator;

import java.util.HashSet;



public class Hash_set1 {
	
	public static void main(String[] args) {
		HashSet HS=new HashSet();    //DS=16,LF---0.75  
		
		HashSet HS1=new HashSet(200,(float)0.70);
		
		HashSet<String>HS2=new HashSet<String>();       //homo
		
		
		HS.add(50);
		HS.add("NEHA");
		HS.add("NEHA");
		HS.add(25.5);
		HS.add('N');
		HS.add(true);
		HS.add(null);
		HS.add(null);
		
		System.out.println(HS);
		
		System.out.println(HS.add('n'));   //true
		
		System.out.println(HS.add(true));    //false
		
		System.out.println(HS.size());
		
		//remove
		
		HS.remove('N');
		System.out.println(HS);
		
		System.out.println(HS.add("MAYURI"));//TRUE
		
		System.out.println(HS.size());
		
		
		//set n get method not present in hashset
		
		System.out.println(HS.isEmpty());   //TRUE OR FALSE--------FALSE
		System.out.println(HS1.isEmpty());   //TRUE
		
		//CONTAINS
		
		System.out.println(HS.contains(null));   //true
		
		System.out.println(HS.contains("mohini"));   //false
		
	
		System.out.println(HS.isEmpty());
	
		
		//for loop is not used in hashset bcz we dont use get method
		
		System.out.println("reading element using for each loop");
		
		for(Object obj:HS) {
			
			System.out.println(obj);
			
		}
		
		System.out.println("reading element using iterator");
		
		Iterator it=HS.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
