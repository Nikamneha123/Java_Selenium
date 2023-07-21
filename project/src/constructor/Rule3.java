package constructor;

public class Rule3 {
	public static void main(String[] args) {
		Rule3 R1=new Rule3();
		Rule3 R2=new Rule3(1);
		Rule3 R3=new Rule3(1,2);
		Rule3 R4=new Rule3(1,2,3);
		
	}
public Rule3() {
	System.out.println("zero argument");
}
public Rule3(int i) {
	System.out.println("one input argument");
}
public Rule3(int i,int j) {
	System.out.println("two input argument");
}
public Rule3(int i,int j,int k) {
	System.out.println("three input argument");
}
}
