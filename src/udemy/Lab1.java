package udemy;

public class Lab1 {

	public static void main(String[] args) {
		// 1) Write a function that takes a value N and returns the sum of 1 to N
		System.out.println(sum(5));
		
		//Write a function that computes factorial. *Hint: Use recursion
		System.out.println("factorial of n is "+ fact(5));
		
		//Write 3 functions that return the min, avg, and max of an array
		int[] numbers = {5, -2, 1, -438, 234, 63}; 
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Avg: " + findAvg(numbers));
	}
	public static int findAvg(int[] arr){
		//TAKE SUM, divide by number of elements
		int sum=0;
		for (int n=0; n < arr.length; n++){
			sum = sum + arr[n];
		}
		System.out.println("Sum: " + sum);
		return sum/arr.length;
	}
	
	
	public static int findMin(int[] arr){ // If we need to find the min, we need to compare it to something
		int min = arr[0];
		for (int i = 0; i < arr.length; i++){   //iterate through entire ARRAY
		if (arr[i] < min) {
			min = arr[1];// if i less than min then reassign to min.
		}
		}
		return min;
	}
	
	public static int sum(int n){
		int sum = 0;
		for(int i=1; i<=n; i++){
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}
	//Assignment 2
	public static int fact(int n){
		if (n==0){
			return 1;
		}
		System.out.println(n);
		return fact(n-1) * n;
	}

}
