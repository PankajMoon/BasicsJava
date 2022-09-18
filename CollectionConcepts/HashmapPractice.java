package CollectionConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapPractice {
	
	 public static void main(String[] args) {
		  
		  // 1. declaration of hashmap.
		  HashMap <Integer, String>hm = new HashMap<Integer, String>();
		  
		  // adding the value.
		  
		  hm.put(101,"ABC");
		  hm.put(102, "LMN");
		  hm.put(103, "PQR");
		  hm.put(104, "ABC");
		  hm.put(105, null);
		  hm.put(null, null);
		  
		  // adding duplicate keys
		  hm.put(101,"ABC");
		  hm.put(null, null);
		  
		  // print.
		  
		  System.out.println(hm);
		  
		  // modifying the existing value.
		  hm.put(102, "DEF");
		  System.out.println(hm);
		  
		  // removing the elememt.
		  
		  hm.remove(105);
		  System.out.println(hm);
		  
		  
		  // how to read the data. // keys // values key and value.
		  
		  for(Entry m:hm.entrySet()) {
			  
//		   System.out.print(m.getKey()+" ");
		   
//		   System.out.print(m.getValue()+" ");
		   
		   System.out.print(m.getKey()+" "+ m.getValue()+" ");
		  } 
		  
		  
		 }

}
