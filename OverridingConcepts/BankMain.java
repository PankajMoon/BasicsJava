package OverridingConcepts;

public class BankMain {
	
	public static void main(String [] args) {
		
		
		RBIBank R = new RBIBank ();
		System.out.println(R.rateofIntrest());
		
		System.out.println("---------------------------------------");
		
		SBIBank S= new SBIBank ();
		System.out.println(S.rateofIntrest());
		
		System.out.println("---------------------------------------");
		
		HDFCbank H=new HDFCbank();
		System.out.println(H.rateofIntrest());
		
		System.out.println("---------------------------------------");
		
		PNBBank P=new PNBBank();
		System.out.println(P.rateofIntrest());
		
		System.out.println("---------------------------------------");
		
		RBIBank R1 = new RBIBank ();
		R.rateofIntrest();
		
		
	}
	
	

}
