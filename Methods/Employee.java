package Methods;

public class Employee {
	
	int empid;     // variable declaration  static/nonstatic
	String empname;
	double empsal;
	int empdept;
	String job;
	
	public void display() {  // method :- logic ==> information
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
		System.out.println(empdept);
		System.out.println(job);
	}
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();    // object creation  ==> copy of class.
		e1.empid=101;
		e1.empname= "ABC";
		e1.empsal= 21250.75;
		e1.empdept= 10;
		e1.job="Developer";
		e1.display();
		
		System.out.println("----------------------------------------------------------");
		
		Employee e2 = new Employee();    // object creation  ==> copy of class.
		e2.empid=102;
		e2.empname= "LMN";
		e2.empsal= 41250.75;
		e2.empdept= 15;
		e2.job="Tester";
		e2.display();
		
		
		System.out.println("----------------------------------------------------------");
		
		Employee e3 = new Employee();    // object creation  ==> copy of class.
		e3.empid=103;
		e3.empname= "xyz";
		e3.empsal= 81250.75;
		e3.empdept= 75;
		e3.job="Manager";
		e3.display();
		
		
	}

}
