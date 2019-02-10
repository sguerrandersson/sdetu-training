package oop;

class Person {
	String name = "Joe";
	String email = "joe@testeamail.com";
	String phone;
	
	void walk(){
		System.out.prinln(name + " is walking")
			}
	void eat(){
		System.out.prinln(name + " is eating")
	}
	void sleep(){
		System.out.prinln(name + " is eating")
	}
} 

public class Demo {

	public static void main(String[] args) {
		// Define some properties
		Person person1 = new Person();
		person1.name ="Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "54554353457";
		
		
		//Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		Person person2 = new Person;
		person2.name = "Sarah";
		person2.sleep();
		
		//Attributes, variables, adjective, descriptors
		
		String name = "Joe";
		String email = "joe@testeamail.com";
		String phone = "45393045844748";
		
		//Action, activity, behaviour
		//System.out.prinln(name + " is walking")
		//System.out.prinln(name + " is eating")
		//walking(name);
		
		//What if we wanted to do this for another person
		String name2 = "Sarah";
		String email2 = "sarah@testeamail.com";
		String phone2 = "4874646555333";
				
		//Action, activity, behaviour
		//System.out.prinln(name2 + " is walking")
		//System.out.prinln(name2 + " is eating")
		walking(name2);
	}
	//Enhance by adding functions to minimize code
	static void walking(String name){
		System.out.println(name + " is walking");
	} 
}
