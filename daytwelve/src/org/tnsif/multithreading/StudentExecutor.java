package org.tnsif.multithreading;
//Every java program is a single threaded program
public class StudentExecutor {

	public static void main(String[] args) {
		//Accessing background thread(main)
		Thread t = Thread.currentThread();   //Factory method: To use the built in returns current thread object(Which already exists)
		System.out.println(t.getName());
		System.out.println(t);                    //invoking toString() method
		System.out.println("-------------------------------------");
		
	}

}
