package Collection_list;

import java.util.Iterator;
import java.util.Vector;



public class Vector1 {
	
	public static void main(String[] args) {
		
		Vector VC=new Vector();//hetro
		
		//insert element
		
		VC.add("Test");
		VC.add(2);
		VC.add(10);
		VC.add('N');
		VC.add(true);
		VC.add(50);
		System.out.println(VC);
		
		
		//size
		
		System.out.println(VC.size());
		
		//REMOVE
		
		VC.remove(2);
		System.out.println(VC);
		
		VC.remove(true);
		System.out.println(VC);
		
		//update
		
		VC.set(2, 100);
		System.out.println(VC);
		
		System.out.println(VC.get(2));
		
		//remove
		
		VC.remove(3);
		System.out.println(VC);
		
	//	System.out.println(VC.remove(3));
		
		System.out.println("READ ELEMENT USING FOR LOOP");
		for(int i=0;i<VC.size();i++) {
			
			System.out.println(VC.get(i));
			
		}
		
		System.out.println();
		
		System.out.println("Reading element using for each loop");
		
		for(Object obj:VC) {
			
			System.out.println(obj);
			
		}
		
		System.out.println();
		
		
		Iterator it=VC.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
