package udemyOop;

class Person { // Creating the BluePrint of the people
	
	String name;
	String email;
	String phone;
	
	
	// VOID is added to make them METHODS!
	void walk () {
		System.out.println(name + " is walking");
		
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an Object
		Person person1 = new Person();
			person1.name = "Joe";
			person1.email = "Joe@google.com";
			person1.phone = "23423423";
			
			person1.walk();
			//person1.eat();
			//person1.sleep();
			
			Person person2 = new Person();
			person2.name = "Marry";
			person2.email = "marry@google.com";
			person2.phone = "46547575";

			
			person2.sleep();
			
		}
	
		/*
		// Person
		String name = "Joe";
		String email = "joe@gmail.com";
		String phone = "347-969-3961";
		
		//Action, activity, behavior that that person does?
		System.out.println(name +  " is waking");
		System.out.println(name +  " is eating");

		//What if we wanted to do this for another person?
		String name2 = "Mary";
		String email2 = "Mary@gmail.com";
		String phone2 = "447-969-3961";
		
		//System.out.println(name2 +  " is waking");
		//System.out.println(name2 +  " is eating");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
		
		
	}
	
	// Enhance by adding function to minimize code
	
	static void walking (String name) {
		System.out.println(name + " is waking.");
	}
*/

}
