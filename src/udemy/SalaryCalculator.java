package udemy;

public class SalaryCalculator {

	public static void main(String[] args) {
		// Let's create a variable
		
		String career;
		System.out.println("Program is starting");
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		//DECLARE & DEFINE
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + "/hour and $" + salary + "/yearly");
		
		
	}

}
