package javadsaproblem;

public class ArraySecondLargestElement {

	public static void main(String[] args) {
		int[] arr= {2,3,4,6,8,9,10};
		int largest=arr[0];
		int secondlargest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondlargest && arr[i]!=largest) {
				secondlargest=arr[i];	
			}
		}
		System.out.println("largest number:"+largest);
		System.out.println("second largest num:"+secondlargest);

	}

}
