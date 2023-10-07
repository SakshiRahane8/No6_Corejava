//Program to demonstrate operations on LinkedList
package daythirteen.tnsif.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		
		numberList.add(23);
		numberList.add(45);
		numberList.add(85);
		numberList.add(65);
		numberList.add(72);
		System.out.println(numberList);
		
		Collections.sort(numberList);
		System.out.println("After sort: "+numberList);
		
		numberList.addFirst(53);
		numberList.addLast(89);
		System.out.println(numberList);
		
		System.out.println("First element: "+numberList.getFirst());
		System.out.println("Last element: "+numberList.getLast());
		
		numberList.removeFirst();
		numberList.removeLast();
		System.out.println(numberList);
		
		//Iterator: Iterate only forward directions and we can remove current element
		Iterator<Integer> it=numberList.iterator();
		while(it.hasNext())        
		{
			System.out.println(it.next());
			//it.remove();
		}
		System.out.println(numberList);
		
		/*ListIterator: Traverse in both the direction and allows to add 
		 * new element, remove current element and modify current element.*/
		ListIterator<Integer> ListIt=numberList.listIterator();
		while(ListIt.hasNext())			//Forward direction
		{
			System.out.println(ListIt.next());
		}
		System.out.println("--------------------------");
		while(ListIt.hasPrevious())		//Backward direction
		{
			System.out.println(ListIt.previous());
		}
		System.out.println("--------------------------");
		ListIt=numberList.listIterator(numberList.size());     //Last position
		
		while(ListIt.hasPrevious())		//Backward direction
		{
			int n=ListIt.previous();
			System.out.println(n);
			if(n==85)
				ListIt.add(100);
			if(n==45)
				ListIt.set(153);
			if(n==72)
				ListIt.remove();
		}
		System.out.println("------------------------");
		System.out.println(numberList);
		

	}

}
