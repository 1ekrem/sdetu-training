package udemy;

public class Cities {

	public static void main(String[] args) {
		// Declare and Define and ARRAY
		
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas" };// One Line array
		System.out.println(cities [0]);
		System.out.println(cities [1]);
		
		System.out.println("");
		
		//Declare Array
		String[] countries;
				
		//Define the Array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[0]);
		
		System.out.println("");
		
		// Declare & Define the array (only size)
		String[] states = new String [5];
		states [0] = "California";
		states [1] = "Ohio";
		states [2] = "New Jersey";
		states [3] = "Texas";
		states [4] = "Utah";
		int i = 0;
		do{ /// DO LOOP: enters the loop then TEST CONDITION.
			System.out.println("STATE: " + states[i]);
			i = i+1; // Every time sysout is executed, "i" WILL be increased by +1
		} while (i < 5); // Once "i" is 4, this statement will stop
		
			// WHILE LOOP: tests condition first then enters the loop!
		int n=0;
		boolean stateFound = false;
		while(!stateFound) { // if stateFound TRUE
			String state = states[n];
			System.out.println(state);
			n++;
			
			if (state == "Texas"){
				System.out.println("STATE FOUND!");	
				stateFound= true;	
			}
			
		}
		
		// FOR LOOP: The best structure for iterating through an array
		System.out.println("");
		System.out.println("nPrinting with FOR LOOP");
		for (int x=0; x < 5 ; x++) { //First block is; 1-)Initialize a variable, 2-) Give a condition 3-) How much to increment
			System.out.println(states[x]);
		}
		}

}
