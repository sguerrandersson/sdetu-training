package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Roger Hue";
		//acc1.balance = 10000;
		
		//Now,from lesson 22, with encapsulation
		acc1.setName("Roger");
		System.out.println(acc1.getName());
		acc1.setSsn("009383377");
		System.out.println("SSN: " + acc1.getSsn());
		
		
		
		/*
		acc1.accountNumber = "01998383";
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		*/
	
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking account");
		acc2.accountNumber = "01998383";
		
		BankAccount acc3 = new BankAccount("Saving account", 5000);
		acc3.accountNumber = "01998383";


		/*
		acc3.checkBalance();
		
		
		
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CDAccount;";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
			
		
	}

}
