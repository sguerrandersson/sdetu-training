 package labs;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student("Johnny", "121231234");
		Student stu2 = new Student("Lisa", "989879876");
		Student stu3 = new Student("Peggy", "234232345");
	
		System.out.println(stu1.createEmail());
		stu1.setUserID();
		stu1.enroll("Eng321");
		stu1.enroll("Phis987");
		stu1.payCourse();
		stu1.checkBalance();
		System.out.println(stu1.toString());
	}
}

	
	class Student {
		private String name;
		private static int iD = 1000;
		private String email;
		private String ssn;
		private String userID;
		private String courses;
		private int balance = 2000;
		private static final int fee = 500; //non lo metterei fisso
		private String phone;
		private String city;
		private String state;
		
		 
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
		
		public String createEmail(){
		String email = name.toLowerCase() + "@testemail.com";
		return email;
		}
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
		
		public void enroll(String course){
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
	
}
		public String toString(){
			return "[Name:" + name + "]\n[Courses: \n" + courses + "]\n[Balance: $" + balance + "]\n";
}
	
	}

