package JavaBasics;

public class PareshsirVariable {
	
         public static void main(String[] args) {
		
		// 1. student rollno. :- 101 ==> numeric ==> integer
		// 2. student name    :- abc pqr xyz    ==> string
		// 3. grade           :- A    ==> char
		
		
		// Declaration of variable.
		
		int rollNumber;
		String name;
		char grade;
		
		// Initialize the variables ==> assigning the values to the variable.
		
		rollNumber =101;
		name="ABC PQR XYZ";
		grade='A';
		
		// Usage 
		System.out.println(rollNumber);
		System.out.println(name);
		System.out.println(grade);
		
		
		// Single line approach ==> declare and intialize
		
		int rollNumber2= 202;
		String name2="Lmn pqr edf";
		char grade2='B';
		
		System.out.println(rollNumber2);
		System.out.println(name2);
		System.out.println(grade2);
		
		// print this student informaation on single line.
		
		System.out.println(rollNumber2 +name2+grade2);
		
		// printing with user message
		
		System.out.println("Student RollNumber:-"+rollNumber2+" Student Name:- "+name2+" Student Grade:- "+ grade2);
		System.out.println("Student RollNumber"+rollNumber2+" Student Name"+name2+" Student Grade"+grade2);
	
	}
	
	// generate the data of 5 student
	// rollno/name/grade ==>5
	
		
}