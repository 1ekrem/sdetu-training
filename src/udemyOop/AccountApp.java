package udemyOop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmortSchedule();
		la.setTerm(20);
	
		
	// 	
	IRate account1 = new LoanAccount(); // We are going to create variable account1 based on the properties of IRate but it will point of the LoanAccount
	account1.increaseRate();
	account1.setRate();
	
		
	}

}
