package Arrays;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		
        int[] arr= {2,3,4,5,6,7,8,9,10,13};
        int even=0;
        int odd=0;
           for(int i=0;i<arr.length;i++) {
        	   if(arr[i]%2==0) {
        		   even++;
        	   }else {
        		   odd++;
        	   }
           }
           System.out.println("count of even numbers" +even);
           System.out.println("count of odd numbers:"+odd);
	}

}
