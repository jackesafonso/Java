package com.fdmgroup.ExerciseTwo;

public abstract class AbstractAndNonAbstractMethods implements PaySalary {
	
	
	private String firstName;
	
	public AbstractAndNonAbstractMethods(String firstName){
		this.firstName = firstName;
	}
	
	
	public abstract int numberOfManager();
	
	public int numberOfEmployee(){
		
		return 15; 
		
		
		
	}

}
