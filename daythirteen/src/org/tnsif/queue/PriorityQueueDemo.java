//Program to demonstrate class Priority Queue
package org.tnsif.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(45);
		queue.add(5);
		queue.add(86);
		queue.add(36);
		System.out.println(queue);
		
		System.out.println(queue.remove() +" Element removed");
		System.out.println("Element to be remove first: "+queue.peek());        //element remove to be first will give by peek() method
		System.out.println("-------------------------------------");
		
		System.out.println("Is the queue is empty: "+queue.isEmpty()+"\n");
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove() +" Element removed");
		}
		System.out.println("\nIs the queue is empty: "+queue.isEmpty());

	}

}
