package AbstractConcreteConcepts;

public class Car extends Vehicle {

	
	 public int getnumberofwheels() { // method with return type
	  return 4;
	 }

	 public int getnumberofpersons() {
	  return 5;
	 }
		
	 public int amountofinsurance() {
	  int amt = getnumberofwheels() * getnumberofpersons();
	  return amt;
	 }

		
	 // car specific
	}
