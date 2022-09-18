package Methods;

public class MethodRulesExample {
	
	static int a = 20;   // static variable
	int b = 10;          // non static variable
	
	public static void m1() {
		System.out.println("This is  static method m1");
	}
	
	public void m2() {
		System.out.println("This is non static method m2");
	}
	
	
	public void m3() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	public static void main(String[] args) {   // static
		
		// rule no .01 ==> static methods can access static members directly
		
		System.out.println(a);
		m1();
		System.out.println("--------------------------------------------------------------------");
		
		// rule no .02 ==> static methods can access non static members with refrence of obj
		MethodRulesExample me = new MethodRulesExample();
		
		System.out.println(me.b);
		me.m2();
		
		// rule 03.==> Non static methods can access static and non-static members directly
		System.out.println("--------------------------------------------------------------------");
		me.m3();
		
	}
	
	
	
	

}
