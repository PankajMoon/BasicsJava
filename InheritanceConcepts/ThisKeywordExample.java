package InheritanceConcepts;

public class ThisKeywordExample {

	
	 // variable declaration.
	 int a;
	 int b; 
		
	 // variable initalization ==> obj/method/constructor
		
	 // initialize ==> 2 ==> 4 variable ==> a b 
		
	 public void getvalues(int a, int b) {
	  this.a=a;
	  this.b=b;
	 }
		
		
	 public void print() { // variable usage
	  System.out.println(a); //25
	  System.out.println(b); //25 
	 }
		
		
		
	 public static void main(String[] args) {
	  
	  
	  ThisKeywordExample tk = new ThisKeywordExample();
	  tk.getvalues(25, 25);
	  tk.print();
	 }
		
		
		
	}
