//Program to demonstrate operations on homogeneous list
package daythirteen.tnsif.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//homogeneous list: It is a list which contains the collection of elements of same data types.
public class HomogeneousArrayList {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();         //Generic list = Integer type
		intList.add(10);
		intList.add(50);
		intList.add(40);
		intList.add(30);
		intList.add(10);
		intList.add(20);
		intList.add(53);
		
		System.out.println("-------------------Initial intList----------------------\n"+intList);
		System.out.println("Size of the list: "+intList.size());
		
		intList.add(2, 70);                                        //Inserting new element at index 2
		System.out.println("\n--------intList after insertion of element 70-----------\n"+intList);
		System.out.println("Size of the list: "+intList.size());
		
		System.out.println("\n---------------indexOf() built in method----------------");
		System.out.println("Index of 40: "+intList.indexOf(40));
		System.out.println("Index of 900: "+intList.indexOf(900));
		
		System.out.println("\n--------------contains() built in method----------------");
		System.out.println("Is 50 present? "+intList.contains(50));
		
		System.out.println("\n---------------remove() built in method-----------------");
		System.out.println("Element removed: " +intList.remove(4));        //takes index as argument of element which has to be remove
		System.out.println(intList);
		
		System.out.println("Removing the element by passing a element to indexOf function to remove function");
		System.out.println("Element removed: " +intList.remove(intList.indexOf(50)));
		//intList.remove(intList.indexOf(50));
		System.out.println(intList);
		
		//intList.remove(10);
		//Throws IndexOutOfBoundException
		
		System.out.println("\n--------------iterator() built in method----------------");
		//Iterate the list
		Iterator<Integer> it = intList.iterator();           
		while(it.hasNext())
		{
			int no=it.next();
			System.out.println(no+" is "+ (no%2==0 ? "Even" : "Odd"));
		}
		
		Collections.sort(intList);               //sorting using Collection.sort
		System.out.println("\n-----------------After sorting----------------- "+"\n"+intList);
		
		Collections.reverse(intList);            ////reverse using Collection.reverse
		System.out.println("\n-----------------After reverse----------------- "+"\n"+intList);
		
		intList.clear();
		System.out.println("Is list empty? "+intList.isEmpty());
		
		List<String> nameList = new ArrayList<String>();
		System.out.println("\n-----------nameList as string list-------------");
		nameList.add("Sakshi");
		nameList.add("Pratik");
		nameList.add("Snehal");
		nameList.add("Karuna");
		nameList.add("Apeksha");
		System.out.println(nameList);
		
		System.out.println("\n------------nameList after sorting-------------");
		Collections.sort(nameList);
		System.out.println(nameList);
		
		
	}

}
