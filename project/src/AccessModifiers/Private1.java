package AccessModifiers;

public class Private1 {
	private int number=200000;
	public static void main(String[] args) {
		Private1 P1=new Private1();
		P1.Test1();
		P1.Test2();
		System.out.println(P1.number);
	}
private void Test1() {
	System.out.println("Private Method:p1");
}
private void Test2() {
	System.out.println("Private Method:p2");
}
}
