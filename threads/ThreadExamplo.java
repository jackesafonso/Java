package com.fdmgroup.threads;

public class ThreadExamplo extends Thread {

	public void run() {

		for (int counter = 0; counter < 1000000; counter++) {
			System.out.println(this.getName() + ":" + counter);
		}
	}

	public static void main(String[] args) {

		ThreadExamplo te1 = new ThreadExamplo();
		te1.setName("Davinder");
		te1.setPriority(1);
		te1.start();

		ThreadExamplo te2 = new ThreadExamplo();
		te2.setName("Adrian"); // set the name of thread
		te2.setPriority(9); // set priority of the thread
		te2.start();

		ThreadAlternative ta = new ThreadAlternative();
		Thread te3 = new Thread(ta); // Runnable object passed into thread
		te3.setName("Runnable thread"); // set name to Runnable thread
        te3.start();
        
        //Join method we - have to wait those threads to finish and then we can continue the program
        try {
        	te1.join();  //has the run method finished for te1
            te2.join();  //has the run method finished for te2
			te3.join();  //has the run method finished for te3
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        System.out.println("Game over"); // the threads has finished, run!

	}

}
