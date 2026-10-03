package Recursion;

public class SumOfNumbers {
	public static int sumLoop(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	
	}
	public static int sumRec(int n) {
		if(n==0) {
			return 0;
		}
		return n+sumRec(n-1);
	}

	public static void main(String[] args) {
		System.out.println("loop:"+sumLoop(5));
		System.out.println("rec:"+sumRec(5));

	}

}
