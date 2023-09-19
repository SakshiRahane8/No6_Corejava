package org.tnsif.multithreading;

public class RunnableImplExecutor {

	public static void main(String[] args) throws InterruptedException{
		//First way - using implementable class of runnable interface(Oldest way)
		RunnableImpl impl = new RunnableImpl();
		Thread threadOne = new Thread(impl,"ChildThread1");
		//threadOne.start();
		
		//Second way - Anonymous class
		Runnable obj = new Runnable() {
			@Override
			public void run() {
				char ch='A';
				for(int i=1; i<=26;i++, ch++)
					System.out.println(Thread.currentThread().getName()+" : "+ch);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Thread threadTwo=new Thread(obj, "ChildThread2");
		//threadTwo.start();
		
		Runnable objOne=()->
		{
			for(int i=1000; i<=1050;i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread threadThree=new Thread(objOne, "ChildThread3");
		//threadThree.start();
		
		//Starting all threads 
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		
		Thread.sleep(1200);
		System.out.println("--------------------------------------------");
		}
				
				
	}


