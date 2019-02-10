package oop;

public class BankAccount implements IRate {
	String accountNumber;
	//Static variables
	//Static >> belong to the class not to the object instance
	//Final >> constant (often static final)
	private static final String routingNumber = "12345";
	
	//Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	//Constructor definition: unique methods
		//1. They are used to define /set up/ initialize properties of an object
		//2. Constructors are IMPLICITLY called upon INSTANTIATION
		//3. The same name as the class itself
		//4. Constructors have NO return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading: call same method name with different arguments
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT " + accountType);
		
	}
	BankAccount(String accountType, double initDeposit){
		//initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $ " + initDeposit);
		String msg = "";
		if (initDeposit < 1000){
			msg = "ERROR: minimum deposit must be at least $ 1000";
			System.out.println(msg);
		} else {
			msg = "Thanks for initial deposit of: $ " + initDeposit;
		}
		System.out.println(msg);
	}
	
	
	//Getters / setters
	
	//Allow the user to define the name
	
	public void setName(String name) {
		this.name = "Mr" + name;
	}
	
	public String getName(){
		return name;
		
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");	
	}
		
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//Define methods
	public void deposit(double amount){
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount){
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	//This is private: can only be called from within the class
	private void showActivity(String activity ){
		System.out.println("YOUR RECENT TRANSACTION:" + activity);
		System.out.println("YOUR NEW BALANCE IS $" + balance);
				
	}
	
	void checkBalance(){
		
	}
	
	
	void getStatus(){
		
		
	}
	
	@Override
	public String toString(){
		//return "[ " + name + ", " + accountNumber + ". BALANCE: $" + balance + "].";
		return "[NAME " + name + ". ACCOUNT # " + accountNumber + ". ROUTING #"+ routingNumber + ". BALANCE: $" + balance + "].";
	}
	
	
}
