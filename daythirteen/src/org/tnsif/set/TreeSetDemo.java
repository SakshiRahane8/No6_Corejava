//Program to demonstrate TreeSet class from SortedSet interface
package org.tnsif.set;

import java.util.Comparator;
import java.util.TreeSet;
/*TreeSet: 1.Contains unique elements only like HashSet.
 * 		   2.Access and retrieval times are quiet fast.
 * 		   3.Stores the elements in ascending order.*/
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();                    
		ts.add("Neha");
		ts.add("Om");
		ts.add("Pooja");
		ts.add("Dhanu");
		ts.add("Samidha");
		//ts.add(null);
		System.out.println(ts);
		
		Comparator<Customer> comp=(c2,c1)->
		{
			return c1.getName().compareTo(c2.getName());
		};
		
		TreeSet<Customer> custSet=new TreeSet<Customer>(comp);
		custSet.add(new Customer("Atharva","Nashik"));
		custSet.add(new Customer("Karuna","Mumbai"));
		custSet.add(new Customer("Kartik","Pune"));
		custSet.add(new Customer("Pratik","Nashik"));
		custSet.add(new Customer("Apeksha","Dhule"));
		System.out.println(custSet);
		

	}

}
