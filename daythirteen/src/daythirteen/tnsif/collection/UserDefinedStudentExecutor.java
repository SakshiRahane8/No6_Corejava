//Program to demonstrate ArrayList with user defined objects
package daythirteen.tnsif.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserDefinedStudentExecutor {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student (1,"Sakshi",89));
		studentList.add(new Student (2,"Karuna",78));
		studentList.add(new Student (3,"Snehal",45));
		studentList.add(new Student (4,"Apeksha",86));
		studentList.add(new Student (5,"Pratik",79));
		System.out.println(studentList);
		
		//Using implementable class of Comparable interface
		Collections.sort(studentList);
		System.out.println("After sorting: "+studentList);
		
		ArrayList<Stud> studList=new ArrayList<Stud>();
		studList.add(new Stud (1,"Sakshi",89));
		studList.add(new Stud (2,"Karuna",78));
		studList.add(new Stud (3,"Snehal",45));
		studList.add(new Stud (4,"Apeksha",86));
		studList.add(new Stud (5,"Pratik",79));
		System.out.println(studList);
		
		//Using implementable class of Comparator interface
		Collections.sort(studList, new SortByName());
		System.out.println("After sorting on name: "+studList);
		
		//Using implementable class of Comparator interface
		Collections.sort(studList, new SortByPer());
		System.out.println("After sorting on per: "+studList);
		
		//Using Lambda Expression
		Comparator<Stud> comp=(s2,s1)->{
			return s1.getName().compareTo(s2.getName());
		};
		Collections.sort(studList,comp);
		System.out.println("After Sorting on Descending order of Name\n"+studList);


	}

}
