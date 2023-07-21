package Typesofvariable;

public class Nonstatic_global_variable {
	int Age=29;
	String Name="Purushottam";
	public static void main(String[] args) {
		Nonstatic_global_variable EXE=new Nonstatic_global_variable();
		System.out.println(EXE.Age);
		System.out.println(EXE.Name);
	}
	public void Test() {
		int Demo=40;
		String name="abc";
		System.out.println(Demo);
		System.out.println(name);
		
	}
	

}
