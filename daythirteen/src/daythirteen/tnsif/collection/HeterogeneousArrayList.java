//Program to demonstrate heterogeneous list
package daythirteen.tnsif.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
//heterogeneous list: It is a list which contains the collection of elements of different data types.
public class HeterogeneousArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List listOne=new ArrayList();
		
		listOne.add(10);
		listOne.add("Hello");
		listOne.add(67.87f);
		listOne.add(false);
		listOne.add(new Date());
		
		System.out.println(listOne);
		
		Collections.sort(listOne);             //Will throw an exception because during sorting integer can't compare with the string.
		
	}

}
