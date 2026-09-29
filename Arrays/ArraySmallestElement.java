package Arrays;

public class ArraySmallestElement {

	public static void main(String[] args) {
		int[] arr= {2,4,3,5,76,54,55,67,32};
		  int smallest=arr[0];
		  for(int i=1;i<arr.length;i++) {
			  if(smallest>arr[i] ) {
				  smallest=arr[i];
				  
			  }
		  }
		  System.out.println("smallest element:" +smallest);

	}

}
