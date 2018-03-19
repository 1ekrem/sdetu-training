package udemyOop;

public class BankAccount implements IRate {

		// Define Variables
		String accountNumber;
		
	private	static final String routingNumber = "10023"; // Make this static so which is not belong to any object but it belongs to a class! 
		// Routing number should be the same for every Account number
		// if you define as "FINAL" then the value cannot be changed. It will be constant!
		
		private String name;
		private String ssn;
		String accountType; 
		double balance = 0;
		
		//Constructor definitions: unique methods
			//1. They are used to define or setup or initialize properties of an Object
			//2. Constructors are IMPLICITLY called upon instantiation
			//3. The same name as the class itself.
			//4. Constructors have NO return type
		// CONSTRUCTOR
		BankAccount(){
			System.out.println("NEW ACCOUNT IS CREATED");
		}
		// Overloading: call same method name with different arguments
		// CONSTRUCTOR
		BankAccount(String accountType){ 
			System.out.println("NEW ACCOUNT: " + accountType);
		}
		// CONSTRUCTOR
		BankAccount(String accountType, double initDeposit){
			System.out.println("NEW ACCOUNT: " + accountType);
			System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
			String Msg = null;
			if (initDeposit < 1000) {
				 Msg = "ERROR: Minimum deposit must be at least $1000";
				//System.out.println(Msg);
			} else {
				 Msg = "Thanks for your intial deposit of $" + initDeposit;
			}
			System.out.println(Msg);
			balance = initDeposit;
		}
	// VARIABLES are only accessible within the method they are defined!
		
	// Getters / Setters
		
	// Allow the user to define the name
		public void setName(String name) {
			this.name = "Mr." + name;
		}
		public String getname() {
			return name;
		}
		
		
	public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		
		//Interface methods
		public void setRate(){
			System.out.println("SETTING RATE");
			
		}
		public void increaseRate(){
			System.out.println("INCREASING RATE");
		}
		
		
		
	//Define Methods
	public void deposit(double amount){
		balance = balance + amount;
		showActivity ("DEPOSIT");
	}
	
	void withdraw(double amount){
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	// PRIVATE: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE: $" + balance);
	}
	
	void checkBalance(){
		System.out.println("Balance: " + balance);
		
	}
	
	void getStatus(){
		
	}
	
	@Override // Why do we call overridden method?
	public String toString(){
		return "[ NAME:" + name +", ACCOUNT # " + accountNumber + ", ROUTING #" + routingNumber + ", BALANCE: $" + balance + " ]";
	}
 
}

