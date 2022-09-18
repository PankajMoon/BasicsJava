package CastingConcept;

public class ExplictCastingPractice {
	
	 public static void main(String[] args) {
	  
	  double d = 125.889874569;
	  float f = (float) d;
	  long l =(long) f;
	  int i =(int) l;
	  short s= (short) i;
	  byte b= (byte) s;
	  
	  
	  
	  System.out.println("double:- "+d);
	  System.out.println("float:- "+f);
	  System.out.println("long:- "+ l);
	  System.out.println("int:- "+ i);
	  System.out.println("short:- "+s);
	  System.out.println("byte:- "+b);
	 }

	}
