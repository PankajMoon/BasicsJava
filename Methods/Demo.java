package Methods;

public class Demo {
	
	// 2 static methods
		// 2 non static
		// call
		
		// static methods
		
		public static void test1() {
			// logic
			System.out.println("This is static method test1");
		}
		
		public static void test2() {
			// logic
			System.out.println("This is static method test2");
		}
		
		
		// Non static 
		
		public void test3() {
			// logic
			System.out.println("This is non static method test3");
		}
		
		public void test4() {
			// logic
			System.out.println("This is non static method test4");
		}
		
		
		
		
		public static void main(String[] args) {
			
			// execute ==> main
			
			// call :- static method. ==> classname.methodname
			Demo.test1();
			Demo.test2();
			
			
			// call :- non static method ==> objname.methodname.
			
			Demo d = new Demo();   // object creation
			d.test3();
			d.test4();
			
			test1();
			test2();
			
		
			Demo.test1();
			Demo.test1();
			Demo.test1();
			System.out.println("Main Method Ends");
			
			
		}
		
		
	}

	
	


