//Program to demonstrate interface Queue (follows FIFO data structure type)
package org.tnsif.queue;

import java.util.ArrayDeque;

public class QueueDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(45);
		queue.add(5);
		queue.add(86);
		queue.add(36);
		System.out.println(queue);
		System.out.println("First element: "+queue.getFirst());
		System.out.println("Last element: "+queue.getLast());
		
		System.out.println(queue.remove() +" Element removed");
		System.out.println("Element to be remove first: "+queue.peekFirst());
		System.out.println("Element to be remove Last: "+queue.peekLast());
		System.out.println("-------------------------------------");
		
		System.out.println("Is queue is empty: "+queue.isEmpty()+"\n");
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove() +" Element removed");
		}
		System.out.println("\nIs queue is empty: "+queue.isEmpty());
		
	}

}
