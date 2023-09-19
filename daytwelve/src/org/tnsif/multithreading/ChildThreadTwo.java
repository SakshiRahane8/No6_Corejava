package org.tnsif.multithreading;

public class ChildThreadTwo extends Thread{
	
		public void run()
		{
			System.out.println("Is 11 is prime: "+Operations.isPrime(11));
		}

}
