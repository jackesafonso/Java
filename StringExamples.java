package com.fdmgroup.firstproject;

public class StringExamples {

	public static void main(String[] args) {

		// call some string methods
		String str2 = new String("Adrian");

		// 1. length 
		int len = str2.length();
		
		// 2. charAt
		for (int counter = 0; counter < len; counter++) {

			char theCharacter = str2.charAt(counter);
			System.out.println(theCharacter);
		}
		
		// 3. indexOf
		int index= str2.indexOf("z");
		
		System.out.println(index);
		
		// 4. equals 		
		boolean strEquals = str2.equals("Adrian");
		System.out.println(strEquals);
		
		// 5. concat
		String newString = str2.concat(" O'Brien ");

		System.out.println(newString);
		
		
		

	}

}
