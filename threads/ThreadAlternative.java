package com.fdmgroup.threads;

public class ThreadAlternative implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable Thread");
		System.out.println("Thread name is " +Thread.currentThread());
		
	}
	
	
	

}
