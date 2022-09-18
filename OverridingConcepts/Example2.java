package OverridingConcepts;

public class Example2 extends Example1 {

	 public static void m1() {
	  System.out.println("This is m1 method from child class");
	 }
		
		
	 public static void main(String[] args) {
	  
	  
	  Example1 e1 = new Example1();
	  e1.m1(); // parent
	  
	  Example2 e2 = new Example2();
	  e2.m1(); // child
	  
	  Example1 e11 = new Example2(); // upcasting
	  e11.m1(); // child XX ==> override ==> hide
	   
	 }
		
	}
