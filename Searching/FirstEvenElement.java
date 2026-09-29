package Searching;

public class FirstEvenElement {

	public static void main(String[] args) {
		int[] arr= {1,10,5,38,40,24,86};
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("found even num:"+i);
				return;
			}
		}
		System.out.println("no element found");
		

	}

}
