package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("123456789", 1000);
		BankAccount acc2 = new BankAccount("413224312", 2000);
		BankAccount acc3 = new BankAccount("984474888", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}
} 
class BankAccount implements IInterest {
	
	private static int iD = 1000; //Internal ID
	private String accountNumber;
	private static final String routingNumber = "004455";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructors
	public BankAccount(String SSN, double initDeposit){
		//System.out.println("New account created");
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
		//System.out.println(iD);
	} 
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "." + random + "." + SSN.substring(0, 2);
		System.out.println("Your account number: " + accountNumber);
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void payBill(double amount){
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		balance = balance + amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);	
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name " + name + "]\n[Account Number: "+ accountNumber + "]\n" + "[Routing number: " + routingNumber + "]" + "]\n[Balance: " + balance + "]"; 
		
	}
}
