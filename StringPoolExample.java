package com.fdmgroup.firstproject;

public class StringPoolExample {

	public static void main(String[] args) {

		// 1. two string literals - they are stored at the SAME MEMORY ADDRESS
		// because they are they same content
		String str = "Adrian";
		String str1 = "Adrian";
		
		// 2. two string objects- stored at DIFFERENT MEMORY ADDRESSES
		String str2 = new String("A");
		String str3 = new String("A");
		
		boolean strCheck = str.equals(str1);
		System.out.println(strCheck);
		
		// 3. Two string objects with same contents that live at DIFFERENT
		// addresses === actually checks the address
		if(str2==str3){
			System.out.println("== String objects gives true");
		}
		
		// 4. Two string literals with same contents live at the SAME address
		// === actually checks the address
		if(str==str1){
			System.out.println("== string literals gives true");
		}

	}

}
