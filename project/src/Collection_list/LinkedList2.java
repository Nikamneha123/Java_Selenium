package Collection_list;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedList2 {
	
	
	public static void main(String[] args) {
		
		LinkedList<String> LL=new LinkedList<String>();
		
		LL.add("N");
		LL.add("E");
		LL.add("H");
		LL.add("A");
		
		System.out.println(LL);
		
		LinkedList<String> LL1=new LinkedList<String>();
		
		
		//ADDALL
		
		LL1.addAll(LL);
		System.out.println(LL1);
		
		//REMOVEALL
		
		LL1.removeAll(LL);
		
		System.out.println(LL1);
		
		//COLLECTIONS
		
		System.out.println("BEFORE SOTING");
		
		Collections.sort(LL);
		
		System.out.println(LL);
		
		//REVERSE_ORDER
		
		Collections.sort(LL,Collections.reverseOrder());
		
		System.out.println(LL);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
