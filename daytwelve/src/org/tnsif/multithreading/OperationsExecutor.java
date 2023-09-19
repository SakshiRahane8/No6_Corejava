package org.tnsif.multithreading;

public class OperationsExecutor {

	public static void main(String[] args) {
		System.out.println("In main "+Thread.currentThread());
		//System.out.println("Factorial of 4: "+Operations.getFactorial(4));
		ChildThreadOne c1= new ChildThreadOne();
		/*Don't call the run method explicitly otherwise it will becomes single threaded application
		c1.run();*/
		
		//c1.start();
		//c1.start();    IllegalThreadStateException
		
		//System.out.println("Is 5 is prime number? "+Operations.isPrime(5));
		ChildThreadTwo c2= new ChildThreadTwo(); 
		c2.start(); 
		
		try {
			c1.join();
			c2.join(); } 
		catch (InterruptedException e) 
		{
			e.printStackTrace(); 
		}
		
		
		System.out.println("-------------------------------------------------------------");
		

	}

}
