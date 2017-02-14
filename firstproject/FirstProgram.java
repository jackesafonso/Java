package com.fdmgroup1.firstproject;

/**
 * Hello world!
 *
 */
public class FirstProgram 
{
	
	public static void task()
	{

	}
	
	
    public void main( String[] args )
    {
    	int intValue = 2147483647;
    	intValue++;
    	
    	System.out.println(intValue);
    	
    	/** exemple of typecasting**/
    	float myFloat =(float) 1.2345678912345;
    	
    	System.out.println("the float was "+myFloat);
    	
    	boolean myBoolean = true;
    	
    	
    	
    	FirstProgram fp = new FirstProgram();
    	fp.task();
    	
    	task();
    }
}
