package Searching;

public class Findname {

	public static void main(String[] args) {
		 String[] str= {"pavan","rahul","sai","kalyan"};
		 String target="sai";
		 boolean found=false;
		 for(int i=0;i<str.length;i++) {
			 if(str[i]==target) {
				 found=true;
				 break;
			 }
			 
		 }
		 System.out.println(found!=false?"present":"not present");

	}

}
