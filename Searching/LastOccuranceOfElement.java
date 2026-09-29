package Searching;

public class LastOccuranceOfElement {

	public static void main(String[] args) {
		int[] arr= {1,2,2,2,2,2,2,2,3,4};
		int target=2;
		int low=0;
		int high=arr.length-1;
		int index=-1;
		while(low<=high) {
			int mid=(low+high)/2;
		    if(arr[mid]==target) {
		    	index=mid;
		    	low=mid+1;
		    }else if(mid<target) {
		    	low=mid+1;
		    }else {
		    	high=mid-1;
		    }
		}
		System.out.println(index);
		

	}

}
