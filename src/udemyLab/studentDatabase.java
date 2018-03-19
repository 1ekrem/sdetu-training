package udemyLab;

public class studentDatabase { //11:50AM

	public static void main(String[] args) {
		
		Student stu1 = new Student ("Ekrem", "777231111");
		Student stu2 = new Student ("Jane", "888232222");
		Student stu3 = new Student ("Karla", "999233333");
		
		stu1.enroll("Eng101");
		stu1.enroll("Math250");
		stu1.enroll("Hist150");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}
}	
	
	class Student{
		private static int iD = 0; // Unique to each person so initialize a variable
		private String userID;
		private String name;
		private String SSN;
		private String email;
		private String phone;
		private String city;
		private String state;
		private String course = "";
		private static final int costofcourse = 800;
		private int balance=0;
	
	//1.Create Constructors
	public Student(String name, String SSN){
		iD++; // 3. Set a static ID. 
		this.name = name;
		this.SSN = SSN;
		setUserID();
		setEmail();
	}
	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}



	// 2.Create an email ID based on the name
	public void setEmail(){
		email = name.toLowerCase() + "." + iD + "@baruch.cuny.edu";
		System.out.println("Your email is: " + email);
	}
	public String getEmail(){
		return email;
	}

	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max - min)));// *10000 makes it 4 digit number
		randNum = randNum + min;
		//System.out.println(randNum);
		userID = iD + ""+ randNum + SSN.substring(5);
		System.out.println("Your User ID: "+ userID);
		
	}
	
	public void enroll(String course){
		this.course = this.course + " " + course;
		System.out.println(course);
		balance = balance + costofcourse;
		
	}
	public void payTuition(int amount){
		balance = balance - amount;
				System.out.println("The amount paid for tuition: $" + amount);
		
	}
	public void checkBalance(){
		System.out.println("Remaining balance: $" + balance);
	}
	public void showCourses(){
		System.out.println(course);
		
	}
	public String toString(){
		return "[NAME; " + name + "]\n[COURSES:" + course+"]\n[BALANCE: $ " + balance + "]";
		
	}
}
	
