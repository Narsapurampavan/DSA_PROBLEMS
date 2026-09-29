package Searching;

public class SquareRootOfElement {

	public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int low=0;
        int high=arr.length-1;
        int target=49;
        while(low<=high) {
        	int mid=(low+high)/2;
        	int sqr=arr[mid]*arr[mid];
        	if(sqr==target) {
        		System.out.println("element found"+mid);
        		return;
        	}else if(sqr>target) {
        		high=mid-1;
        	}else {
        		low=mid+1;
        	}
        }
        
	}

}
