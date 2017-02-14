package com.fdmgroup.ExerciseTwo;

public class Employee extends AbstractAndNonAbstractMethods{ 
	
	private String employeeAddress;
	
	Employee(String employeeAddress, String firstName){
		super(firstName);
		this.employeeAddress = employeeAddress;
	
	}
	
	
	public int numberOfEmployee(){
		
		return 15;
	}


	@Override
	public int numberOfManager() {
		// TODO Auto-generated method stub
		return 15;
	}

}
