package Collection_list;
import java.util.ArrayList;
public class Arraylist4 {
	
	
	public static void main(String[] args) {
		ArrayList AL=new ArrayList();
		AL.add("MAYURI");
		AL.add("NEHA");
		AL.add(null);
		AL.add(true);
		AL.add(100);
		
		
		
		
		System.out.println(AL);
		
		System.out.println(AL.size());
		
		AL.remove("MAYURI");
		AL.remove(2);
		System.out.println(AL);
		
		//INSERT NEW ELEMENT
		
		AL.add(25.2);
		System.out.println(AL);
		
		System.out.println(AL.get(2));
		
		AL.set(2,200);
		System.out.println(AL);
		
		//AL.isEmpty();
		System.out.println(AL.isEmpty());
		
		System.out.println("Reading element using for EACH loop");
		
		for(Object obj:AL) {
			System.out.println(AL);
			
			
			
			
		}
		
		
		
		
		
		
		}

}
