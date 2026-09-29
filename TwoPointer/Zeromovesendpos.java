package TwoPointer;

import java.util.Arrays;

public class Zeromovesendpos {
	public static void moveZero(int arr[]) {
		int slow=0;
	    for(int fast=0;fast<arr.length;fast++) {
		      if(arr[fast]!=0) {
			          int temp=arr[slow];
			            arr[slow]=arr[fast];
			            arr[fast]=temp;
			            slow++;
			
		}	
		}
		      
	}
	public static void main(String[] args) {
		int[] arr= {1,0,3,0,4,0};
		moveZero(arr);
		for(int arr1:arr) {
			System.out.print(arr1+" ");
		}
	}

}
