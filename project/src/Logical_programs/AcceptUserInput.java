package Logical_programs;

import java.util.Scanner;

public class AcceptUserInput {
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner SC=new Scanner(System.in);
		
		int num=SC.nextInt();
		
		System.out.println();
		
		System.out.println("ENTER SECOND NUMBER");
		
		int num1=SC.nextInt();
		
		System.out.println("Addition of two numbers :"+(num+num1));
		
		System.out.println("Substraction of two numbers :"+(num-num1));
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
