package ThisandSuper;

public class Sample3 extends Sample2 {
	
	int RollNo=20;
	String Name="Selenium";
	public void Demo() {
		int RollNo=30;
		String name="python";
		System.out.println(RollNo);
		System.out.println(Name);
		System.out.println();
		System.out.println(this.RollNo);
		System.out.println(this.Name);
		System.out.println();
		System.out.println(super.Name);
		System.out.println(super.RollNo);
		
		
	}
	public static void main(String[] args) {
		Sample3 S2=new Sample3();
		S2.Demo();
		
		
	}

}
