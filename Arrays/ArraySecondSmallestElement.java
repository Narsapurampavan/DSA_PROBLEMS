package Arrays;

public class ArraySecondSmallestElement {

	public static void main(String[] args) {
	int[] arr= {2,4,3,1,5,7,4,5};
	int smallest =arr[0];
	int secondsmallest=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<smallest) {
		  secondsmallest=smallest;
		  smallest=arr[i];
		}else if(arr[i]<secondsmallest && arr[i]!=smallest) {
			secondsmallest=arr[i];
		}
	}
	System.out.println("Smallest value:"+smallest);
	System.out.println("Second smallest value:"+secondsmallest);

	}

}
