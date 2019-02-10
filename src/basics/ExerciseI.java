package basics;

public class ExerciseI {

	public static void main(String[] args) {
		/*
		 Write 3 functions that take an array as a parameter 
		 and return the minimum, average, and maximum values of that array.
		Hint: this should be static functions with a return type 
		of the same data type as the array declaration.
		 */
		
		//trovo la media dei valori nell'array
				System.out.println("Avvio calcolo media");
				int[] numGg = {1, 2, 8, 5, 9, 25, 450};
				int minGg = 0;
				for (int x =0; x < 7; x++){
					minGg = minGg+ numGg[x];
					}
				System.out.println(minGg/5);
				}
}
//trovo il max nlll'array
		/*
			System.out.println("Avvio calcolo max");
			
			int[] numDays = {1, 2, 8, 5, 9, 7};
			int max = 0;
			for (int x =0; x < 5; x++){
				if (numDays[x]>max){
					max = numDays[x];
				}
			}
			System.out.println(max);
/*
//trovo il min nlll'array
	System.out.println("Avvio calcolo min");
	
	int[] numDays = {1, 2, 8, 5, 9, 7};
	int min = numDays[0];
	for (int x =0; x < 5; x++){
		if (numDays[x]< min){
			min = numDays[x];
		}
	}
	System.out.println(min);
*/
	



