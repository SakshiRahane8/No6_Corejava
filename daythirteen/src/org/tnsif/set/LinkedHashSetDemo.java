//Program to demonstrate operations on LinkedHashSet class from Sets interface
package org.tnsif.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
/*LinkedHashSet: 1.Contains unique elements only like HashSet.
 * 				 2.Stores the elements in insertion order.
 * 				 3.Provides all optional set operations and permits null elements. */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs =new LinkedHashSet<Integer>();
		lhs.add(2);
		lhs.add(82);
		lhs.add(1);
		lhs.add(6);
		lhs.add(35);
		lhs.add(27);
		System.out.println("LinkedHashSet(lsh): "+lhs);
		
		//Iterator: Iterate only forward directions
		Iterator<Integer> it=lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList<Integer> numList = new ArrayList<Integer>(lhs);
		Collections.sort(numList);
		System.out.println("LinkedHashSet(lsh) After sorting: "+numList);
		
		System.out.println("-----------------------------------------------------");
		
		LinkedHashSet<Customer> custSet =new LinkedHashSet<Customer>();
		custSet.add(new Customer("Atharva","Nashik"));
		custSet.add(new Customer("Karuna","Mumbai"));
		custSet.add(new Customer("Kartik","Pune"));
		custSet.add(new Customer("Pratik","Nashik"));
		custSet.add(new Customer("Apeksha","Dhule"));
		//custSet.add(new Customer(null,null));
		System.out.println(custSet);
		
		//Lambda Expression: For sets where we can't perform direct sorting
		ArrayList<Customer> CustomerList=new ArrayList<Customer>(custSet);
		System.out.println(CustomerList);
		Comparator<Customer> comp=(c1, c2)->{
			return c1.getCity().compareTo(c2.getCity());
		};
		Collections.sort(CustomerList,comp);         
		System.out.println(CustomerList);
		
	}

}
