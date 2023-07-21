package ThisandSuper;

public class Sample1 {

		int Number=100;
		int Num=200;
		String Name="Automation";
public void Test() {
	int Number=500;
	int Num=600;
	System.out.println(Number);
	System.out.println(Num);
	System.out.println(Name);
	System.out.println();
	System.out.println(this.Number);
	System.out.println(this.Num);
	
}
public static void main(String[] args) {
	Sample1 S1=new Sample1();
	S1.Test();
}

}
