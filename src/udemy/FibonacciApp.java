package udemy;

public class FibonacciApp {

	public static void main(String[] args) {
		// Fibonacci number is defined by the sum of the 2 previous fibonacci numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(1) + fib(0) = 1 + 0 = 1
		//fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		//fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		//fib(5) = fib(4) + fib(3) = 3 + 2 = 5
	//	System.out.println(fib(4));
		System.out.println(fact(6));
	
	//   ASSIGNMENT
		// 1! = 1 * 1
		// 2! = 2 * 1
		// 3! = 3 * 2 * 1
		// 4! = 4 * 3 * 2 * 1
	}
	
	/*public static int fib(int n){
		if (n==0) {
			return 0; // If N is 0; RETURN 0.
		
		}else if (n == 1) {
			return 1; // If N is 1; RETURN 1.
		}
		return ((fib(n-1)) + (fib(n-2))); // This is called RECURSION
	}*/
	//Exercise 2
	public static int fact(int x) {
		
		if (x == 0){
			return 1;
		}
		else if (x == 1){
			return 1;
	}	
		return fact(x-1) * x;
}
	}


