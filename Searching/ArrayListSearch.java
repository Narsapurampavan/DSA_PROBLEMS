package Searching;


import java.util.Arrays;
import java.util.List;

public class ArrayListSearch {

	public static void main(String[] args) {
	 List<String> list=Arrays.asList("pen","pencil","book","paper");
	 String target="book";
	 for(int i=0;i<list.size();i++) {
		 if(list.get(i).equals(target)) {
			 System.out.println("found string:"+i);
			 return;
		 }
	 }
	  System.out.println("not found");
		
		
	}

}
