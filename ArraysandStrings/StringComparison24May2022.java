package ArraysandStrings;

public class StringComparison24May2022 {
	
public static void main(String[] args) {
		
		String s1= "Velocity";
		String s2 = "VELOCITY";
		String s3= "Veloc";
		
		// equals() :- compare the two string.
		System.out.println(s1.equals(s2));     // boolean value ==> also check the case==> case sensitive method.
		
		// equalsingnorecase():- compare the two strings but the casing will not matter. ==> only validate the content
		System.out.println(s1.equalsIgnoreCase(s2));  // true
		
		// contains() :- comapre one string is a part of another string ==> case sensitive
		System.out.println(s1.contains(s3)); // true 
		
		// isempty() :- will check given string is empty  or not.
		System.out.println(s1.isEmpty());   // true ==> flase
		
		//concats :- will use to add two strings   (+ operators :- user message and program output)
		 
		String s4 = "ABC";
		String s5 = "XYZ";
		System.out.println(s4.concat(s5));
		System.out.println(s4.concat("LMN"));
		
		// startswith :- will check any string starts with a perticular pattern.
		System.out.println(s4.startsWith("AB"));   // true ==> false 
		
		// endswith :- will check any string ends with a perticular pattern.
		System.out.println(s5.endsWith("YZ"));  // true ==> false
		
		// replace :- will help you to replace the part of the string by new string or new combination of characters
		
		String s6 = "This is java Automation Testing class";
		//System.out.println(s6.replace("java", "python"));  // temporary operation ==> this is  not permant
		String s7=s6.replace("java", "pyton");
		System.out.println(s7);
		System.out.println(s6.replace("Automation", "Development"));
		
		// substring :- extract the part/portion of the string based on index
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,5));
		
		
		// split() :- to split your given string based  on specific pattern.
		String s8 = "This@is@java@Automation@Testing@class";
		String words[]=s8.split("@");
		System.out.println(words.length);
		for (int i =0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		
		// How to revrse the string in java.  + 2 line palindrome
		 
		String  Original = "madam";
		String reverse= "";
		
		for (int i=Original.length()-1;i>=0;i--) {
			reverse=reverse+Original.charAt(i);
		}
		System.out.println(reverse);
		
		if(Original.equals(reverse)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
	

	
	
	
}
	
	
	

