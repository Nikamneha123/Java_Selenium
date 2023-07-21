package Interface;

public class Test {
	public static void main(String[] args) {
		AdvancedCalculator AC=new AdvancedCalculator();
		AC.Addition();
		AC.Multiplication();
		AC.Substraction();
		System.out.println();
		
		AC.Log();
		AC.Tan();
		System.out.println();
		AC.Sin();
		AC.Cos();
		System.out.println();
		Calculator C2=new AdvancedCalculator();
		C2.Addition();
		C2.Multiplication();
		C2.Substraction();
		System.out.println();
		Casio C3=new AdvancedCalculator();
		C3.Log();
		C3.Tan();
		C3.Addition();
	}

}
