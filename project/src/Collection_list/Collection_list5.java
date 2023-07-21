package Collection_list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class Collection_list5 {
	
	public static void main(String[] args) {
		
		ArrayList AL=new ArrayList();
		
		AL.add("mohini");
		AL.add(12);
		AL.add(true);
		AL.add(null);
		AL.add(12.4);
		AL.add(100);
		 System.out.println(AL);
		 
		// AL.remove("mohini");
	//	 System.out.println(AL);
		 
		 AL.remove(5);
		 System.out.println(AL);
		 
		 //RETRIVE-------get
		 //REPLACE--------SET
		 
		 System.out.println(AL.get(0));
		 
		 System.out.println(AL.get(3));
		 
		 AL.set(1,"mayuri");
		 System.out.println(AL);
		 
		System.out.println(AL.isEmpty());
		
		//reading element by using for each loop
		
		//syntax   for(datatype refvar:arraylist refvarname)
		
		
		for(Object obj:AL) {
			
			System.out.println(obj);
			
			
		}
		
		//reading element by using iterator
		
		
		Iterator AL2=AL.iterator();
		
		while(AL2.hasNext()) {
			
			System.out.println(AL2.next());
		}
		
		//addall
		
		ArrayList duplicate=new ArrayList();
		
		duplicate.addAll(AL);
		
		System.out.println(duplicate);
		
		
		duplicate.removeAll(duplicate);
		
		System.out.println(duplicate);
		
		//colectionS 1.sort   2.reverseorder  3.shuffle
		
		
		System.out.println(AL);
		
		
		
		ArrayList AL3=new ArrayList();
		
		AL3.add("W");
		AL3.add("V");
		AL3.add("A");
		
		System.out.println(AL3);
		
		Collections.sort(AL3);
		System.out.println(AL3);
		
		Collections.sort(AL3,Collections.reverseOrder());
		
		System.out.println(AL3);
		
		
		Collections.shuffle(AL3);
		
		System.out.println(AL3);
		
		Collections.shuffle(AL);
		
		System.out.println(AL);
		
		//convert array to arraylist
		
		
		String a[]= {"mouse","CAT","DOG"};
		
		
		for(String element:a) {
			System.out.println(element);
		}
		
		//System.out.println(a);
		
		ArrayList AL4=new ArrayList(Arrays.asList(a));
		System.out.println(AL4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		
		
		
		
		
	}

}
