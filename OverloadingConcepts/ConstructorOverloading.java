package OverloadingConcepts;

public class ConstructorOverloading {

	 ConstructorOverloading(){
	  System.out.println("This is zero argument constructor");
	 }
		
	 ConstructorOverloading(int a){
	  System.out.println("This is one int argument constructor");
	 }
		
	 ConstructorOverloading(int a, int b){
	  System.out.println("This is two int argument constructor");
	 }
		
	 ConstructorOverloading(double a, double b){
	  System.out.println("This is two double argument constructor");
	 }
		
	 ConstructorOverloading(float a, float b){
	  System.out.println("This is two float argument constructor");
	 }
		
		
	 ConstructorOverloading(String a, String b){
	  System.out.println("This is two String argument constructor");
	 }
		
		
	 public static void main(String[] args) {
	  
	  ConstructorOverloading co = new ConstructorOverloading(25 ,50);
	  ConstructorOverloading co1 = new ConstructorOverloading();
	  
	 }
		
	}
