package Interface;

public class HSBC implements RBIBank,USBank,BrazilBank {

	@Override
	public void Bikeloan() {
		System.out.println("HSBC-----Bikeloan");
		
		
	}

	@Override
	public void PersonalLoan() {
		System.out.println("HSBC-----personal loan");
		
		
	}

	@Override
	public void MutualFunds() {
		System.out.println("HSBC----mutual fund");
		
		
	}

	@Override
	public void Carloan() {
		System.out.println("HSBC-----carloan");
		
		
		
	}

	@Override
	public void CreditCard() {
		System.out.println("HSBC-----creditcard");
		
		
	}

	@Override
	public void DebitCard() {
		System.out.println("HSBC-----debitcard");
		
		
	}

	@Override
	public void TransferMoney() {
		System.out.println("HSBC-----transfer money");
		
	}
	
	

}
