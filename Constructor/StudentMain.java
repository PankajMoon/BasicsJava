package Constructor;

public class StudentMain {
	
	
	public static void main(String[] args) {
		  
		  // approach one :- initialization by using object
		  
		// Student s = new Student(); // object creation 
		// s.rollno = 101;
		// s.name = "ABC";
		// s.grade ='A';
		// s.display();
		  
		  System.out.println("-------------------------------------------------------");
		  
		  // approach two :- initalization by using method
		  
		// Student s1 = new Student(); //jvm ==> default constructor
		// s1.getStudentDetails(201, "LMN", 'B'); // intializaion
		// s1.display();
		  
		  
		  // approach 3 :- constructor :- initialization by using constructor
		  
		  Student s2 = new Student(301, "XYZ", 'C'); 
		  s2.display();
		  
		  
		 }

}
