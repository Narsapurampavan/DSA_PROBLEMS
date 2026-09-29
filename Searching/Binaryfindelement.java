package Searching;

public class Binaryfindelement {

	public static void main(String[] args) {
       int[] arr= {30,29,34,4,2,10};
       int target=40;
       //declare two variable left,right
       int left=0;
       int right=arr.length-1;
       while(left<=right){
    	   int mid=(left+right)/2;
    	   if(arr[mid]==target) {
    		   System.out.println("found:"+mid);
    		   return;
    	   }else if(arr[mid]<target) {
    		   left=mid-1;
    	   }else {
    		   right=mid+1;
    	   }
           
       }
       System.out.println("no element found");
		
		
		
		
	}

}
