package Collection_list;
import java.util.ArrayList;
//import java.time.Duration;
import java.util.Collections;
import java.time.Duration;

public class Array_list2 {
	
	public static void main(String[] args) {
		
		ArrayList AL=new ArrayList();
		
	//	AL.add("N,E,H,A");
		
	//	AL.add("NEHA,MAYURI,SUREKHA");
		
		AL.add("1,2,3,4");
		
	/*	AL.add("N");
		AL.add("E");
		
		AL.add("H");
		AL.add("A");  */
		
		System.out.println(AL);
		
	
	
	//ArrayList duplicate=new ArrayList();
	
	//duplicate.removeAll(AL);
		
		
		//addAll
ArrayList Duplicate= new ArrayList();
Duplicate.addAll(AL);
System.out.println(Duplicate);

        //removeall
Duplicate.removeAll(AL);
System.out.println(Duplicate);
        
        //Collections
System.out.println(AL);
Collections.sort(AL);
System.out.println(AL);
          //
Collections.sort(AL,Collections.reverseOrder());

System.out.println(AL);

Collections.shuffle(AL);
System.out.println(AL);
	
Collections.shuffle(Duplicate);
System.out.println(Duplicate);
		
		
	}	
		
	}

	
	
	
	
	
	
	


