package PraTypesofvar;

public class LocVar {
	static int number=100;//static var
	int num1=40;//nonstatic
	
	
	public static void main(String[] args) {
		LocVar.Test();
		System.out.println(number);
		LocVar lc=new LocVar();
		System.out.println(lc.num1);
		
	}
public static void Test() {
	int Num=50;
	String Name="ABC";
	System.out.println(Num);
	System.out.println(Name);
	
}

}
