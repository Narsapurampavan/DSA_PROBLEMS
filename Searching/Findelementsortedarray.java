package Searching;

public class Findelementsortedarray {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6,7,8};
		 int key=6;
		 boolean found=false;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==key) {
				 found=true;
				
			 }
			 if(arr[i]>key) {
				 break;
			 }
		 }
		 
		 System.out.println(found!=false?"found element":"not found");

	}

}
