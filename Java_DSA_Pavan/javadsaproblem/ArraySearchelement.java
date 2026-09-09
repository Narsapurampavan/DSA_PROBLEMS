package javadsaproblem;

public class ArraySearchelement {

	public static void main(String[] args) {
	   int[] arr= {2,3,4,5,6,3,7,9};
	   int key=3;
	   boolean found=false;
	   for(int i=0;i<arr.length;i++) {
		   if(key==arr[i]) {
		  found=true;
		  System.out.println("index found "+i);
		  break;
		  
	   }

	}
	   if(found)
	   {
		   System.out.println("element is founds" );
	   }else {
		   System.out.println("element is not found");
	   }

	}
}

