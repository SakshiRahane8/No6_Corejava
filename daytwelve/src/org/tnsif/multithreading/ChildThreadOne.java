package org.tnsif.multithreading;

public class ChildThreadOne extends Thread{
	public void run() 
	{
		System.out.println("Factorial of 5: "+Operations.getFactorial(5));
	}

}
