package Constructor;

public class Demo {
	

		// variable declaration.
		
		int a;
		String str;
		
		// Zero argument constructor
		
		Demo(){
			System.out.println("this is user defined zero argument constructor");
			// variable initialization
			a=10;
			str = "30 april";
		}
		
		// With argument constructor
		
		Demo(int c, String d){
			System.out.println("This is with argument construcor");
			a =c;
			str = d;
		}
		
		
		
		
		public void test(){
			System.out.println(a);
			System.out.println(str);
		}
		
	}
	
	
	
	


