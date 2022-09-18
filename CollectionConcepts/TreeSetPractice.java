package CollectionConcepts;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
	
	 public static void main(String[] args) {
		  
		  
		  TreeSet <String>sh =new TreeSet<String>(); // generic.  
		  
		  sh.add("Z");
		  sh.add("A");
		  sh.add("L");
		  sh.add("C");
		  sh.add("B");
		  sh.add("E");
		  sh.add("M");
		  
		  System.out.println(sh);
		  
		  // adding the duplicate.
		  sh.add("A");
		  sh.add("L");
		  sh.add("C");
		  System.out.println(sh);
		  
		  // presence of elemenet.
		  
		  System.out.println(sh.contains("Z"));
		  
		  // to check first and last value in treeset.
		  System.out.println(sh.first());
		  System.out.println(sh.last());
		  
		  // remmoving first and last value.
		  sh.pollFirst();
		  sh.pollLast();
		  System.out.println(sh);
		  
		  // checking the immediate higher and lower element
		  
		  String val ="C";
		  System.out.println("Higher value is:- "+ sh.higher(val));
		  System.out.println("Lower value is:- "+ sh.lower(val));
		  
		  // reading the values.
		  
		  Iterator itr = sh.iterator();
		  while (itr.hasNext()) {
		   System.out.print(itr.next()+ " ");
		  }
		  System.out.println();
		  for(String value:sh) {
		   System.out.print(value+ " ");
		  }
		  
		  
		 }

}
