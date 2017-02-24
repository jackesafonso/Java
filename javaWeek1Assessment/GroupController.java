package com.fdmgroup.javaWeek1Assessment;

import java.util.Map;

public class GroupController {

	
	private DatabaseReader mockReader;
	private int String;
	private java.util.Map<java.lang.String, Trainee> Map;

	public GroupController(DatabaseWriter mockWriter, DatabaseReader mockReader) {
		this.mockReader = mockReader;
	}

	public Map<String, Trainee> getAllTrainees() {
	 
		mockReader.readGroup();
		
		
		return null;
	}

	public void addTrainee(Trainee mockTrainee) {
		// TODO Auto-generated method stub
		
	}

	public void removeTraineeByUsername(String string2) {
		// TODO Auto-generated method stub
		
	}

}
