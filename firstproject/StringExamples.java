package com.fdmgroup1.firstproject;

public class StringExamples {

	public static void main(String[] args) {
		
		
		
		String str2 = new String("Adrian");
		
		int len = str2.length();
		for(int counter=0;counter<len;counter++)
		{
		  char theCharacter = str2.charAt(counter);
	      System.out.println(theCharacter);
		}
		
		
		int index = str2.indexOf("a");
        System.out.println(index);
        
        
        boolean strEquals = str2.equals("Adrian");
        System.out.println(strEquals);
        
        
        
      
	}

}
