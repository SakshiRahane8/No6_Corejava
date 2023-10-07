//Program to demonstrate operations on HashSet class from Sets interface
package org.tnsif.set;

import java.util.HashSet;
/*HashSet: 1.Contains unique values only(No duplicates allow).
 * 		   2.Stores the elements by using a mechanism called hashing.
 * 		   3.unordered set. */
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(4);
		hs.add(6);
		hs.add(5);
		hs.add(81);
		hs.add(1);
		hs.add(53);
		hs.add(9);
		System.out.println(hs);
		hs.add(45);
		System.out.println("First set(hs): "+hs);
		
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(4);
		hs1.add(57);
		hs1.add(5);
		hs1.add(61);
		hs1.add(8);
		hs1.add(53);
		System.out.println("\nIs 9 added: "+hs1.add(9));                  //add function is a boolean type returns true or false
		System.out.println("Is 9 added: "+hs1.add(9));
		System.out.println(hs1);
		hs1.add(45);
		System.out.println("\nSecond set(hs1): "+hs1);
		
		hs1.addAll(hs);                                  //addAll gives a union of the sets
		System.out.println("\nResultant set: "+hs1);
		
		hs1.clear();									 //Clear all elements
		
		//Again insertion of elements in set hs1
		hs1.add(4);
		hs1.add(57);
		hs1.add(5);
		hs1.add(61);
		hs1.add(8);
		hs1.add(53);
		hs1.add(45);
		hs1.add(9);
		
		hs1.removeAll(hs);                                //Common values will be remove  //performs(hs1-hs)
		System.out.println("Resultant set: "+hs1);
		

	}

}
