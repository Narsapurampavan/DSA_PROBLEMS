package javadsaproblem;

public class ArrayCountofelements {

	public static void main(String[] args) {
		int arr[]= {2,3,4,4,4,1,3,4};
		int key=3;
		int count=0;
		for(int i=0;i<arr.length;i++) {
		      if(key==arr[i] ) {
		    	  count++;
		      }
		}
		System.out.println("key value: "+count);
		}

	}


