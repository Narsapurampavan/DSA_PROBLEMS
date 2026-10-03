package Recursion;

public class SumofDigit {

	

	    static int sum(int n) {

	        // Base condition
	        if (n == 0) {
	            return 0;
	        }

	        // Recursive call
	        return (n % 10) + sum(n / 10);
	    }

	    public static void main(String[] args) {

	        int n = 1234;

	        System.out.println("Sum of digits: " + sum(n));
	    }
	}	 



