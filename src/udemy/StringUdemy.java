package udemy;

public class StringUdemy {
	
/// STRING API
	
	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Ekrem";
		String lastName = "Ersayin";
		String SSN = "123456789";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		//Print the initials plus last 4 digits of SSN
		System.out.println(firstName.substring(0, 1));
		System.out.println(lastName.substring(0, 1));
		System.out.println(SSN.substring(5)); // There are 9 numbers so start from the INDEX=5 which is 6.
	}

}
