package Collection_list;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedList1 {
	
	public static void main(String[] args) {
		
		LinkedList LL=new LinkedList();
		
		LinkedList<String>LL1=new LinkedList<String>();
		
		//add/insertion element in LL
		
		LL.add("NEHA");
		LL.add("WELCOME");
		LL.add(3);
		LL.add(true);
		LL.add(null);
		LL.add(false);
		LL.add(23.5);
		
		System.out.println(LL);
		
		System.out.println(LL.size());
		
		System.out.println(LL.remove("WELCOME"));
		
		System.out.println(LL);
		
		LL.add("COLLECTION");
		
		LL.add(5, 100);
		
		System.out.println(LL);
		
		//get
		
		System.out.println(LL.get(3));
		
		//FIRST_ELEMENT
		
		System.out.println(LL.getFirst());
		
		
		//LAST_ELEMENT
		
		System.out.println(LL.getLast());
		
		//ISEMPTY
		
		System.out.println(LL.isEmpty());   //FALSE
		
		System.out.println(LL1.isEmpty());     //TRUE
		
		
		
		//CONTAINS
		
		System.out.println(LL.contains("NEHA"));  //TRUE
		
		System.out.println(LL.contains("NIVEDITA"));    //FALSE
		
		//READING ELEMENT USING FOR LOOP
		
		System.out.println("READING ELEMENT FOR LOOP");
		
		for(int i=0;i<LL.size();i++){
			
			System.out.println(LL.get(i));
			
		}
		
		
		System.out.println();
		
		System.out.println("READING ELEMENT USING FOR EACH LOOP");
		
		for(Object obj:LL) {
			
			System.out.println(obj);
		}
		
		
		System.out.println("Reading element using iterator");
		
		Iterator it=LL.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
