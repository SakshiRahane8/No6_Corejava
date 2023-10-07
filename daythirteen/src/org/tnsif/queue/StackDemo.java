//Program to demonstrate class Stack(follows LIFO data structure type)
package org.tnsif.queue;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st= new Stack<Integer>();
		//Collections are dynamic 
		st.add(10);
		st.add(80);
		st.add(40);
		st.add(60);
		st.add(80);
		System.out.println("Size of stack: "+st.size());
		System.out.println("Element to be remove first: "+st.peek());
		
		System.out.println("\nIs the stack is empty: "+st.isEmpty());
		while(!st.isEmpty())
		{
			System.out.println("Element removed: "+st.pop());
		}
		System.out.println("Size of stack: "+st.size());
		System.out.println("\nIs the stack is empty: "+st.isEmpty());
		
	}

}
