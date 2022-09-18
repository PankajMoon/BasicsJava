package Methods;

public class SampleMain {
	
	
	

		// main method  ==> call
		
		public static void main(String[] args) {
			
			// static method.
			
			Sample.m1();
			Sample.m2();
			
			// non static method ==> sample object.
			
			Sample sm = new Sample();  // object creation.
			sm.m3();
			sm.m4();
			
		}

}
