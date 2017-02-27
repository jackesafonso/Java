package com.fdmgroup.javaWeek1Assessment;

import java.util.Map;

public class GroupController {
	
	private DatabaseWriter databaseWriter;
	private DatabaseReader databaseReader;

	public GroupController(DatabaseWriter mockWriter, DatabaseReader mockReader) {

		databaseWriter = mockWriter;
		databaseReader = mockReader;

		
	}

	public DatabaseWriter getDatabaseWriter() {
		return databaseWriter;
	}

	public void setDatabaseWriter(DatabaseWriter databaseWriter) {
		this.databaseWriter = databaseWriter;
	}

	public DatabaseReader getDatabaseReader() {
		return databaseReader;
	}

	public void setDatabaseReader(DatabaseReader databaseReader) {
		this.databaseReader = databaseReader;
	}

	public Map<String, Trainee> getAllTrainees() {
		Map<String, Trainee> map;
		map = databaseReader.readGroup();
		return map;
		// TODO Auto-generated method stub
		
	}

	public void addTrainee(Trainee mockTrainee) {
		
		databaseWriter.addTrainee(mockTrainee);
		
	}

	public void removeTraineeByUsername(String string) {
		databaseWriter.deleteTraineeByUsername(string);
		
	}

}
