package Star_program;

public class Star2 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {    //outerloop
			
			for(int j=1;j<=5;j++) {
				
				if(j>=6-i) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
