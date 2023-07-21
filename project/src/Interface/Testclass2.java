package Interface;

public class Testclass2 {
	public static void main(String[] args) {
		HSBC HB1=new HSBC();
		HB1.Bikeloan();
		HB1.Carloan();
		HB1.CreditCard();
		HB1.DebitCard();
		HB1.MutualFunds();
		HB1.PersonalLoan();
		HB1.TransferMoney();
		System.out.println(RBIBank.MinBalance);
		System.out.println();
		RBIBank RB1=new HSBC();
		
		RB1.CreditCard();
		RB1.DebitCard();
		RB1.TransferMoney();
		System.out.println();
		USBank UB1=new HSBC();
		UB1.MutualFunds();
		UB1.Carloan();
		System.out.println();
		BrazilBank BB=new HSBC();
		BB.Bikeloan();
		BB.PersonalLoan();
		
		
		
		
	}

}
