package labs;

public class Student {

		private String name;
		
		//Answer 3. It sets a private static ID
		private static int iD = 1000;
		private String email;
		private String ssn;
		private String userID;
		private String courses;
		private int balance = 2000;
		private static final int fee = 500; //non lo metterei fisso
		/*Answer 6. Use encapsulation to set variables phone, city, state */
		private String phone;
		private String city;
		private String state;
		
		private int i = 0;
		
		 
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

		public Student(String name, String ssn){
			iD++;
			this.name = name;
			this.ssn = ssn;
			createEmail();
			setUserID();
		}
		
		
		//Answer 2. It creates automatically an email based on the name (see also in the class StudentApp)
		public String createEmail(){
		String email = name.toLowerCase() + "@testemail.com";
		return email;
		}
		
		/*Answer 4. 
		It generates a user ID that is a combination of a Static 
		ID, a random 4-digit number between 1000 and 9000 and the last 4 
		digits of the SSN. 
		*/
		//min = 1000 & max  = 9000
		public void setUserID() {
			//min= 1000 max=9000
			int randomNumber = (int) (Math.random() * (9000-1000));
			//userID = iD + (int) randomNumber;
			randomNumber = randomNumber + 1000;
			System.out.println(randomNumber);
			userID = iD + randomNumber + ssn.substring(6, 8);
			System.out.println(userID);
		}
		
		
		/* Answer 5. Implement the following methods: enroll(), pay(), 
		 checkBalance(), toString(), showCourses */
		
		public void enroll(String course){
			//String[] courses = new String[5];
			//course[0] = course;
			//i++;
			//System.out.println("Ecco i corsi: " + corsi.);
			courses = courses + "\n" + course;
			System.out.println(courses);
			
		}
		
		public void payCourse(){
			this.balance = this.balance - this.fee;
			System.out.println("The course fee is $" + fee + " and actual balance is now $" + balance);
		}
		
		public void checkBalance(){
			System.out.println("The actual balance is now $" +balance + ".\n");
		}
		
		public void showCourses(){
			return null:
		}
		
		public String toString(){
			return "[Name:" + name + "]\n[Courses: \n" + courses + "]\n[Balance: $" + balance + "]\n";
		}	
}

