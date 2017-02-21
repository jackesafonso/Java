package com.fdmgroup.collectionsExercises;

import java.util.ArrayList;

public class CollectionsCountString {
	
	ArrayList<String> faarray = new ArrayList<String>();
	
	public void addValueToArray(){
		
		faarray.add("Jackes");

	}
	
	public ArrayList<String> getArrayValue(){
		
		return faarray;
		
	}
	
	
	public static void main(String[] args) {
		
		CollectionsCountString ccs = new CollectionsCountString();
		ccs.addValueToArray();
		ccs.getArrayValue();
		
		ArrayList<String> myccs = ccs.getArrayValue();
		System.out.println(myccs);
	}

}
