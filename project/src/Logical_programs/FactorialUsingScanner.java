package Logical_programs;

import java.util.Scanner;

public class FactorialUsingScanner {
	
	  public static void main(String[] args) {  
          
	     int n,fact=1;
	     System.out.println("Enter any number ");
	     Scanner R=new Scanner(System.in);
	    n=R.nextInt();
	    for(int i=1;i<=n;i++) {
	    	
	    	fact=fact*i;
	    	
	    }
	     System.out.println("Factorial "+ fact);
	     
	     
	
	
	  }

}