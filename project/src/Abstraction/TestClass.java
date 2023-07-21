package Abstraction;

public class TestClass {
	public static void main(String[] args) {
		HDFCBank HB=new HDFCBank();
		HB.Creditcard();
		HB.Debitcard();
		HB.Loan();
		HB.Funds();
		System.out.println();
		
		
		
		RBIBank RB=new HDFCBank();
		RB.Loan();
		RB.Creditcard();
		RB.Debitcard();
		
	}

}
