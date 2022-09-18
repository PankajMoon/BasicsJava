package ArraysandStrings;

public class StringOperations23May22 {
	
public static void main(String[] args) {
		
		String s = "Velocity";
		String S1 ="  I am Leaving in Maharashtra    ";
		
		// 1. Length () :- to find out the number of characters inside the string.
		System.out.println(s.length());
		
		// 2. Uppercase() :- convert the lower case into the upper case.
		System.out.println(s.toUpperCase());
		
		// 3. lowercase() :- convert the uppercase or regular case letters into lower case.
		System.out.println(s.toLowerCase());
		
		// 4. charat():- this is used to find out the letter/alphabate available at perticular index.
		System.out.println(s.charAt(3));
		
		// 5. indexof() :- will help you to find out the index of any character/ first occuranace.
		System.out.println(s.indexOf("e"));
		
		// 6. lastindexof() :- will help you to find out the last occurance of any character.
		System.out.println(s.lastIndexOf("e"));
		
		// 7. trim() :- will help you to remove unwanted space at the starting or ending of the string.
		System.out.println(S1);
		System.out.println(S1.trim());
		
	}
	
}
	
	
	


