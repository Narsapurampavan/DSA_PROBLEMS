package Arrays;

public class minElement {
	public static void main(String[] args) {
		int arr[] = {1,2,3,10,4,5,6,4};
		
		int minElement = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			minElement = Math.min(minElement, arr[i]);
		}
		System.out.println(minElement);
	}

}
