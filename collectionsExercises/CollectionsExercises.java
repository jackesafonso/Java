package com.fdmgroup.collectionsExercises;

import java.util.HashMap;
import java.util.HashSet;

public class CollectionsExercises {

	HashSet<String> fHadesHashSet = new HashSet<String>();

	public void addValueTofHadesHashSet() {

		fHadesHashSet.add("Mary");
		fHadesHashSet.add("Joanne");
		fHadesHashSet.add("Ella");
		fHadesHashSet.add("Rita");
		fHadesHashSet.add("Paula");
		fHadesHashSet.add("Joanne");
		fHadesHashSet.add("Rita");
		fHadesHashSet.add("Rita");
		fHadesHashSet.add("Jackes");
		

	}

	public HashSet<String> retrivingValueTofHadesHashSet() {

		return fHadesHashSet;

	}
	
	
	public static void main(String[] args) {
		CollectionsExercises questions = new CollectionsExercises();
		questions.addValueTofHadesHashSet();
		HashSet<String> names = questions.retrivingValueTofHadesHashSet();
		System.out.println(names);

	}

}
