package udemyOop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Ekrem Ersayin"; 
		//Define with Encapsulation
		
		// Encapsulation #1 getters and setters
		acc1.setName("Ekrem Ersayin");
		System.out.println(acc1.getname());

		// Encapsulation #2 getters and setters
		acc1.setSsn("890-123-2333");
		System.out.println( "SSN #" + acc1.getSsn());
		
		acc1.accountNumber = "0198234";
		acc1.balance = 10000;
		
		//Calling Interface methods ---> Point of Interface
		acc1.setRate();
		acc1.increaseRate();
		
		
		acc1.deposit(1000);
		acc1.deposit(1000);
		acc1.deposit(1000);
		acc1.withdraw(500);

		// Polymorphism through overriding
		System.out.println(acc1.toString());// CALL toString method --> Result Printed as ; udemyOop.BankAccount@7852e922
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0198234";
		
		BankAccount acc3 = new BankAccount("Sacving Account", 5000);
		acc3.accountNumber = "0198234";
		/*
		// Check the account balances
		acc1.checkBalance();
		acc2.checkBalance();
		acc3.checkBalance();
		
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
		//System.out.println(acc3.routingNumber);
		
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Erik";
		cd1.accountNumber = "23423423";
		cd1.interestRate = "4.5";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
	*/
	}
}
