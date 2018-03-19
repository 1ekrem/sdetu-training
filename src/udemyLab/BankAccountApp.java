package udemyLab;

public class BankAccountApp {

	public static void main(String[] args) {
			BankAccount acc1 = new BankAccount("465329874", 1000.50); // --> SSN numbers
			BankAccount acc2 = new BankAccount("273467823", 2000);
			BankAccount acc3 = new BankAccount("234234566", 2500);
			
			acc1.setName("Erik");
			System.out.println(acc1.getName());
			
			acc1.makeDeposit(500);
			acc1.makeDeposit(600);
			acc1.payBill(1000);
			acc1.accrue();
			System.out.println(acc1.toString());
			
	}
}	

	class BankAccount implements IInterest{
		// Lets define properties of the bank	// We'll use ENCAPSULATION so we will make them PRIVATE
		private static int iD = 1000;					// Internal ID - Unique ID for each person - this property should belong to a class, not each persons. 
		private String accountNumber; 	// iD + random 2-digit number + first 2 digits of SSN
		private static final String routingNumber = "005400657";	// This routing number cannot be changed since it is "STATIC FINAL"
		private String name;			//
		private String SSN;				//
		private double balance;					//
	
	//Let's create our constructors
		public BankAccount(String SSN, double initDeposit){
			balance = initDeposit;
			this.SSN = SSN;
			iD++;
			setAccountNumber();
		}
	
		private void setAccountNumber(){
			//How to calculate and get a random number
			int random = (int) (Math.random() * 100);
			accountNumber = iD + "" + random + SSN.substring(0, 2);
			System.out.println("Your account number: " + accountNumber);
		}
		public void setName (String name){
			this.name = name; //Encapsulation
		}
		public String getName (){
			return name;
		}
		
		public void payBill(double amount) {
			balance = balance - amount;
			System.out.println("Paying Bill: $" + amount);
			showBalance();
		}
		
		public void makeDeposit (double amount) {
			balance = balance + amount;
			System.out.println("Making Deposit of: $" + amount);
			showBalance();
		}
		public void showBalance(){
			System.out.println("Balance: $" + balance);
		}
		
		@Override
		public void accrue() {
			balance = balance * (1+(rate/100));
			showBalance();
		}
		@Override
		public String toString() {
		return "[Name: " + name +  " ]\n[Account Number: " + accountNumber + "]\n" +"[Routing Number: " + routingNumber + "]\n" + "[Balance " + balance + "]";
		}
	}


