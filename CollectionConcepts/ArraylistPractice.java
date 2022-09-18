package CollectionConcepts;

import java.util.ArrayList;

public class ArraylistPractice {
	
	public static void main(String[] args) {
		
	      // Declaring an arrylist; // common way of declaration ==> homogeneous as well as hetreogenous
	  ArrayList al = new ArrayList();
	      
	  
	      // Generic Declaration ==> homogenous data 
	 
	// ArrayList <String> al1 = new ArrayList <String>();
	// ArrayList <Integer> al2 = new ArrayList <Integer>();
	// ArrayList <Character> al3 = new ArrayList <Character>();
	      
	      //Adding the values inside the arraylist.
	      
	      al.add(15); // 0
	      al.add("ABC"); // 1
	      al.add('A'); // 2
	      al.add(15); //3
	      
	      System.out.println(al);
	      
	      // Modifying arraylist
	      al.add(2, 'B');
	      System.out.println(al);
	      
	      // Data replace
	      al.set(2, "XYZ");
	      System.out.println(al);
	      
	      // data remove.
	      //al.remove(4);
	      System.out.println(al);
	      
	      // checking the emptiness.
	      System.out.println(al.isEmpty());
	      
	      // size.
	      System.out.println(al.size());
	      
	      // location of information ==> index
	      
	      System.out.println(al.indexOf(15));
	      System.out.println(al.lastIndexOf(15));
	      
	      // Contains ==> check avaibility of the data
	      System.out.println(al.contains("PQR")); 
	      
	      // get ==> will help you to find data at perticular index.
	      System.out.println(al.get(1));
	      System.out.println(al.get(2));
	      
	      
	      // to read full arraylist. ==> regular expression 
	      
	      for(int i=0; i<al.size();i++) {
	       System.out.print(al.get(i)+ " ");
	      }
	      
	      System.out.println();
	      
	      // advanced for loop.
	      
	      for (Object value:al) {
	       System.out.print(value+ " ");
	      }
	      
	      
	 }
		

}
