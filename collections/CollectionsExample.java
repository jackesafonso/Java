package com.fdmgroup.collections;

import java.util.*;

public class CollectionsExample {

	public static void main(String[] args) {

		// ************************************LIST***********************************************************************
		ArrayList<String> al = new ArrayList<String>();

		// System.out.println(al.size()); // will show 0 as nothing has been
		// entered into the Array yet
		//
		// al.add("Adrian"); //item 0
		// al.add("Barry"); //1
		// al.add("Charles"); //2
		// al.add("Daniel"); //3
		// al.add("Edward"); //4
		// al.add("Freddy"); //5
		//

		// System.out.println(al.get(5));
		//
		// System.out.println(al.size());

		// ***********************************SET************************************************************************

		// HashSet<String> adesHashSet = new HashSet<String>();
		// adesHashSet.add("Adrian");
		// adesHashSet.add("Adrian");
		// adesHashSet.add("Adrian");
		// adesHashSet.add("Adrian");
		// adesHashSet.add("Adrian");
		//
		//
		//
		//
		// System.out.println(adesHashSet.size());
		//
		// adesHashSet.remove("Adrian");
		//
		// System.out.println(adesHashSet.size());

		// ***********************************MAP***********************************************************************
		// HashMap<Integer,String> adesHashMap = new HashMap<Integer,String>();
		// adesHashMap.put(1, "Adrian"); //To add to the HashMap
		// adesHashMap.put(2, "Barry"); //use .put to add values
		// adesHashMap.put(3, "Charles"); //Duplicate values will be overwritten
		// adesHashMap.put(4, "Daniel"); //Values will be ordered by INDEX
		// number
		// adesHashMap.put(5, "Edward"); //Duplicate INDEX values will be
		// OVERWRITTEN
		// adesHashMap.put(2, "Zak"); //Here Zak overwrites "Barry" as the INDEX
		// 2 has been assigned to ZAK now.
		//
		//
		// System.out.println(adesHashMap.keySet());
		// System.out.println(adesHashMap.values());
		// System.out.println(adesHashMap.entrySet());
		//
		// String item = adesHashMap.get(4); //Will retrieve the 4th INDEX -
		// Daniel
		// System.out.println(item); //Will print Daniel

		// ***************************************QUEUE**************************************************************************
		// PriorityQueue<String> theQueue = new PriorityQueue<String>(); //First
		// in first out (FIFO)
		// theQueue.add("A");
		// theQueue.add("B");
		// theQueue.add("C");
		// theQueue.add("D");
		// theQueue.add("E");
		// theQueue.add("F");
		// theQueue.add("G");
		// System.out.println(theQueue.toString());
		// System.out.println(theQueue.size());
		//
		// theQueue.remove(); //This will remove the first entry entered so "A"
		// will be removed first from the Queue
		// System.out.println(theQueue.toString());
		// System.out.println(theQueue.size());

		// **************************************STACK*************************************************************
		// Stack<String> stack = new Stack<String>(); //Last in First out LIFO
		// stack.push("Adrian");
		// stack.push("John");
		// stack.push("Wayne");
		// stack.push("James");
		// stack.push("Mel");
		//
		// System.out.println(stack.toString()); //Use .toString method to print
		// the contents on Stack
		//
		// stack.add("Alan");
		// System.out.println(stack.toString());
		// stack.pop(); //Will remove Alan
		// stack.pop(); //Will remove Mel
		// System.out.println(stack.toString());

		// ******************************************LINKEDLIST*****************************************************
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addFirst("Adrian");
		linkedList.addLast("John");
		linkedList.addFirst("Alan");
		linkedList.addLast("Kevin");
		linkedList.addFirst("Mike");
		linkedList.addLast("Martin");

		System.out.println(linkedList.toString());
		linkedList.add(1, "Here i am"); // Using add with the index
		linkedList.add(4, "Here you go");
		System.out.println(linkedList.toString());

	}

}
