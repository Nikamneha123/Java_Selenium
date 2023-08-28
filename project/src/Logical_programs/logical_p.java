package Logical_programs;

public class logical_p {

	
	public static void main(String[] args) {
		String str = "stayhomestaysafe";
		System.out.println("Returning words:");
		String[] arr = str.split("y",0);
		for (String w : arr) {
		System.out.println(w);
		}
	}
}
