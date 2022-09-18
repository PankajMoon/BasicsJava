package CollectionConcepts;

import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		  
		  LinkedHashSet <String> sh = new LinkedHashSet <String>();
		  
		  // adding the elements inside linked hashset
		  
		  sh.add("A");
		  sh.add("B");
		  sh.add("C");
		  sh.add("D");
		  sh.add("E");
		  sh.add("F");
		  sh.add("Z");
		  sh.add("L");
		  
		  System.out.println(sh);
		  
		  // adding the duplicate data.
		  
		  sh.add("A");
		  sh.add("B");
		  System.out.println(sh);
		  
		  // finding the number of elements present in linked hashset.
		  
		  System.out.println("The size of linked hashset is:- "+ sh.size());
		  
		  // checking the presence of element.
		  System.out.println("Checking the presence of element:- "+ sh.contains("L"));
		  
		  // removing the element :-1. direct removal 2. removal with status.
		  
		  sh.remove("L");
		  System.out.println(sh);
		  
		  System.out.println(sh.remove("Z"));
		  System.out.println(sh);
		  
		  
		 }
			
			
		}


