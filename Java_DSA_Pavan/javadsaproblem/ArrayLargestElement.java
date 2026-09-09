package javadsaproblem;

public class ArrayLargestElement {

	public static void main(String[] args) {
		int[] arr= {2,4,6,3,25,18,22};
		int largest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		System.out.println("largest element: "+largest);

	}

}
