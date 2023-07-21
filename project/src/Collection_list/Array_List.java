package Collection_list;
import java.util.ArrayList;
import java.util.Iterator;
public class Array_List {
	
	public static void main(String[] args) {
		
		int arr[]=new int[5];//static+similar type data
		
		ArrayList AL=new ArrayList(); //dynamic array=homogeneous+heterogeneous type data
		
		ArrayList<String> AL1=new ArrayList<String>();//static arraylist
		
		//1.ADD
		AL.add("Automation");
		AL.add("java");
		AL.add(1000);
		AL.add(10.6d);
		AL.add(70);
		AL.add(true);
		AL.add(null);
		AL.add(708);
		System.out.println(AL);
		
		//2.SIZE
		
		System.out.println("Number of element-----------" +AL.size());
		
		//3.REMOVE
		
		System.out.println(AL);
		AL.remove(2);
		AL.remove(10.6d);
		AL.remove(null);
		
		System.out.println(AL);
		
		//4.insert new element
		
		AL.add(20);
		AL.add(2,"python");
		AL.add(3,true);
		
		System.out.println(AL);
		
		//5.Retrive spcific elemenTS
		//we can use get method for retriv th element
		
		System.out.println(AL.get(2));
		
		//6.Replace change method
		//we use set method
		
		AL.set(2,"NEHA");
		
		System.out.println(AL);
		
		//isempty
		
		System.out.println(AL.isEmpty());
		System.out.println(AL1.isEmpty());
		
		System.out.println();
		
		//READ/PRINT THE DATA FROM ARRAYLIST
		
		System.out.println("Reading element using for EACH loop");
		
		for(Object obj:AL) {
			
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("reading element using iterator");
		
		//iterator
		
		//Iterator AL2=AL.iterator();
		
		Iterator AL2=AL.iterator();
		
		while(AL2.hasNext()) {
			
			
			System.out.println(AL2.next());
		
		
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
