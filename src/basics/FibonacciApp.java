package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fibonacci number is defined by the sum of the 2 previous Fibonacci numbers
		// fib(0) = 0
		// fib (1) = 1
		// fib (2) = fib(1) + fib(0) = 1 + 0 = 1
		//System.out.println(fib(20));
		System.out.println("Avvio calcolo fattoriale");
		System.out.println(fact(6));
		
		int[] numDays = {1, 2, 8, 5, 9, 7};
		for (int x =0; x < 5; x++){
			int max = 0;
			if (numDays[x]>max){
				max = numDays[x];
			}
			System.out.println(max);
		}
		System.out.println(numDays[2]);
		
		// 1! = 1 * 1
		// 2! = 2 * 1
		/*
		int p = 1;
		int x = p;
		int s = 0;
		while(x > 0){
			x = x - 1;
			s = s + x;
		}
		System.out.println("La somma dei numeri che precedono " + p + " è " + s);
	
	
	}
	*/
		/*
	public static int fib(int n){
		if (n == 0 ){
			return 0;
		} else if (n == 1){
			return 1;
		}
		return ( (fib(n-1) +  fib (n - 2 )));
	*/
	// sum (0) = 0
	// sum (1) = 1
	// sum (2) = sum(n-1)
	
	/*
	public static int sum(int n){
		if (n == 0 ){
			return 0;
		} else if (n == 1){
			return 1;
		}
		return ( (sum(n-1) +  sum(n - 2 )));

	}
	*/
	/*
	public static int fact(int n){
		if (n == 0 ){
			return 1;
		} else if (n == 1){
			return 1;
		}
		return ( (n *  fact (n - 1 )));
	*/
	}

/*
 Write 3 functions that take an array as a parameter 
 and return the minimum, average, and maximum values of that array.
Hint: this should be static functions with a return type 
of the same data type as the array declaration.
 * 
 * 
 */

	
	
 */

