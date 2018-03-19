package udemyOop;

public class CDAccount extends BankAccount implements IRate { // CDAccount is SubAccount of BankAccount when extended!!
		
	String interestRate;
	
	void compound() {
		System.out.println("Compounding Interest");
	}

}
