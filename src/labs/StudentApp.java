package labs;

public class StudentApp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			//Answer 1. A constuctor that takes name and ssn in the arguments
			Student stu1 = new Student("Johnny", "121231234");
			Student stu2 = new Student("Lisa", "989879876");
			Student stu3 = new Student("Peggy", "234232345");
		
			
			//Answer 2. It creates automatically an email based on the name (see also in the class Student)
			System.out.println(stu1.createEmail());
			stu1.setUserID();
			stu1.enroll("Eng321");
			stu1.enroll("Phis987");
			stu1.payCourse();
			stu1.checkBalance();
			System.out.println(stu1.toString());
		}	
	

}
