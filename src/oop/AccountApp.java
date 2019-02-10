package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmortSchedule();
		la.setTerm(20);
		
		//Polymorphism changes where we are pointing
		//In altre parole, creo una variabile account1 sulla base di una
		//interfaccia e dico che i metodi sono quelli che ho istanziato in una
		//implementazione della interfaccia ovvero LoanAccount. Tuttavia ho solo a disposizione 
		//i metodi dell'interfaccia, non tutti quelli della sua implementazione
		//in LoanAccount()
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();

	}
	
	
	
		
	
}
