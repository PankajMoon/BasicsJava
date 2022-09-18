package Methods;

public class MethodCasesPractice {
	
	int x =20;    // variable dec + initalization
	int y =10;
	double d = 200.5;
	
	
	// case 1.  method will not accept parameter and will not return anything.
	
//	public void sum() {
//		System.out.println(x+y);
//	}
	
	// case 2.  method will not accept parameter and will return anything.
	
	public double sum() {
		return x+d;
	}
	
//	// case 3.  method will accept parameter and will not return anything.
	
//	public void sum(int a, int b) {
//		System.out.println(a+b);
//	}
	
	
	 //case 4.  method will accept parameter and will return anything.
		
		public int sum(int a, int b) {
			return a+b;
		}
	
	
	
	public static void main(String[] args) {
		
		
		// Case 1
//		MethodCasesPractice mcp = new MethodCasesPractice();
//		mcp.sum();
		
		
		
		// Case 2
//		MethodCasesPractice mcp = new MethodCasesPractice();
//		double z =mcp.sum();
//		System.out.println(z);
//		System.out.println(mcp.sum());
		
		
		
		// Case 3
//		MethodCasesPractice mcp = new MethodCasesPractice();
//		mcp.sum(100, 500);
//		mcp.sum(10, 50);
//		
		// Case 4
		MethodCasesPractice mcp = new MethodCasesPractice();
		int z = mcp.sum(100, 500);
		System.out.println(mcp.sum(100, 500));
		
		
		
		
	}

}
