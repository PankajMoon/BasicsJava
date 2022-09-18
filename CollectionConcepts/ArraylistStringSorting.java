package CollectionConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistStringSorting {

		 public static void main(String[] args) {
		  
		  // arraylist declaration.
		  ArrayList <String>list = new ArrayList<String>();  
		  
		  // adding the elements.
		  
		  list.add("audi");
		  list.add("Activa");
		  list.add("Maruti800");
		  list.add("BMW");
		  list.add("Bullet");
		  list.add("nano");
		  list.add("mercedez-Benz");
		  
		  System.out.println("Arraylist before sorting :- "+ list);
		  
		  // sorting the arraylist in ascending order
		  // activa audi bmw bullet maruti 800 mercedez nano.
		  
		  Collections.sort(list);
		  System.out.println("Arraylist after sorting :- "+ list);
		  
		  
		  // sorting the arraylist in DESCENDING order
		  
		  Collections.sort(list,Collections.reverseOrder());
		  System.out.println("Arraylist after sorting in desc :- "+ list);
		  
		  
		  
		  
		 }
		}


