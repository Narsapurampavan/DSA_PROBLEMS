package Searching;

public class InsertpositionOfElement {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5};
		int target=6;
		int low=0;
		int high=arr.length-1;
		int index=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				System.out.println("element found:"+mid);
				return;
			}else if(arr[mid]>target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
			index=low;
		}
		System.out.println(index);
	
	}
	
}

