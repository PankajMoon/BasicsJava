package CastingConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Test {

	 public static void main(String[] args) {
	  
	  // Parent Class 
	  
	  Father f = new Father();
	  f.car();
	  f.money();
	  f.home();
	  
	  System.out.println("___________________________________________________");
	  
	  // child class.
	  Son s = new Son();
	  s.car();
	  s.money();
	  s.bike();
	  s.home();
	  
	  // Upcasting ==> parent refrence is used to hold the child object but only those properties are 
	  //elgible for upcasting process which are declared in parent
	  
	  System.out.println("___________________________________________________");
	  
	  Father f1= new Son();
	  
	  f1.car(); //car
	  f1.home(); // home
	  f1.money(); // $50
	  
	  
	  // DownCasting :- child refrence is used to hold the parent object. is not possible.
	  System.out.println("___________________________________________________");
	  
	  Son s1= (Son) new Father();
	  s1.bike();
	  s1.car();
	  s1.home();
	  s1.money();
	  
	  
	  ArrayList al = new ArrayList(); // regular way of declaration 
	  List al1 = new ArrayList(); // upcasting process // upacasting approach of declaration.
	  List al2 = new LinkedList();
	  List al3 = new Vector();
	  
	  
	  HashSet sh = new HashSet();
	  Set sh1 = new HashSet(); // upcasting process
	  
	 }
		
		
		
	}
