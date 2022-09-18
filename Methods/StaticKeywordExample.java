package Methods;

public class StaticKeywordExample {
	
	int empid;
	String empName;
	 static int deptno;
	
	public void getvalues() {
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(deptno);
	}
	
	
	
	public static void main(String[] args) {
		
		StaticKeywordExample sk1 = new StaticKeywordExample();
		sk1.empid =101;
		sk1.empName ="ABC";
		deptno=30;
		sk1.getvalues();
		System.out.println("------------------------------------------------------");
		
		StaticKeywordExample sk2 = new StaticKeywordExample();
		sk2.empid =102;
		sk2.empName ="LMN";
		sk2.getvalues();
		System.out.println("------------------------------------------------------");
		
		StaticKeywordExample sk3 = new StaticKeywordExample();
		sk3.empid =102;
		sk3.empName ="XYZ";
		sk3.deptno=45;
		sk3.getvalues();
		System.out.println("------------------------------------------------------");
		
		
		StaticKeywordExample sk11 = new StaticKeywordExample();
		sk11.empid =1011;
		sk11.empName ="ABC";
		deptno=35;
		sk11.getvalues();
		System.out.println("------------------------------------------------------");
		
		StaticKeywordExample sk12 = new StaticKeywordExample();
		sk12.empid =1012;
		sk12.empName ="LMN";
		sk12.getvalues();
		System.out.println("------------------------------------------------------");
		
	}
	
	
	
	
	
}


