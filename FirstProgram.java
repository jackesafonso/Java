package com.fdmgroup.firstproject;

public class FirstProgram 
{
	
	public void task()
	{
		
	}
	
    public static void main( String[] args )
    {

    	// 1. Creating variables
    	int intValue = 2147483647;
        intValue++;
        System.out.println(intValue);
        
        float myFloat = (float)1.23456789012345;
        System.out.println("the float was "+myFloat);
    	
    	boolean myBoolean = true;

    	// 2. calling a non static method in a class
    	FirstProgram fp = new FirstProgram();
    	fp.task();
    	    	
    	
    }
}
