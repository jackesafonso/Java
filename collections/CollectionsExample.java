package com.fdmgroup.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsExample {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size());
		
	//	al.add("Adrian"); // item 0
	//	al.add("Adrian"); // 1
	//	al.add("Adrian"); // 2
	//	al.add("Adrian"); // 3
		
	//	System.out.println(al.get(0)); //   check index 
		
	//	System.out.println(al.size()); 
		
	//	HashSet<String> adesHashSet = new HashSet<String>();
	//	adesHashSet.add("Adrian");
	//	adesHashSet.add("Adrian");
	//	adesHashSet.add("Adrian");
	//	adesHashSet.add("Adrian");
		
	//	System.out.println(adesHashSet.size());
		
	//	adesHashSet.remove("Adrian");
		
	//	System.out.println(adesHashSet.size());

	HashMap<Integer,String> adesHashMap = new HashMap<Integer,String>();
	adesHashMap.put(1, "Adrian");
	adesHashMap.put(3, "John");
	adesHashMap.put(2, "Mike");
	// do not accept duplicates, so the value John will be override
	adesHashMap.put(3, "Jackes");
	
	System.out.println(adesHashMap.keySet());
	System.out.println(adesHashMap.values());
	System.out.println(adesHashMap.entrySet());
	
	String item =adesHashMap.get(1);
	
	System.out.println(item);
	
	}

}
