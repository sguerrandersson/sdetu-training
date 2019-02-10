package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word" + wordChoice);
		}
		
		String browser = "Chrome";
		//if (browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is chrome");
		}
		String firstName = "Tim";
		String lastName = "Short";
		String SNN = "987654331";
		
		System.out.println("There are " + SNN.length() + " digit in your SSN");
		
		//Print the initials plus last 4 digits of SSN;
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.println(SNN.substring(5));
		}
}
