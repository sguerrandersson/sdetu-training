package basics;

public class Weather {
	 public static void main(String[] args){
		 //this program will give suggestion on what to wear based on the weather (temperature and sun condition)
		 int temperature = 45;
		 String sunCondition = "Sunny";
		 
		 if (temperature > 80) {
			 System.out.println("It is pleasant. Wear short and T-Short.");
		 }
		 else if ((temperature > 60) && (sunCondition == "Sunny")) {
			 System.out.println("It is a bit cooler. Perhaps wear a long-sleeve shirt and jeans.");
			 System.out.println("Wear a hat to keep the sun out of your eyes.");
		 }
		 else if ((temperature > 50 || sunCondition == "overcast")){
			 System.out.println("This is a cool day. Make sure to wear warmer clothes.");
		 }
		 else {
			 System.out.println("Looks like a cold day. Bring a sweater.");
		 }
		 System.out.println("The program is ending.");
	 }
}
