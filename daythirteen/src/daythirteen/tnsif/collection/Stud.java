//Program to demonstrate Comparator Interface
package daythirteen.tnsif.collection;

import java.util.Comparator;

public class Stud {
	private int rollNo;
	private String name;
	private float per;
	
	//getters setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}
	
	//non-parameterized constructor
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Stud(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}

}

//SortByName implementable class of Comparator interface
class SortByName implements Comparator<Stud>
{
	@Override
	public int compare(Stud o1, Stud o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}

//SortByPer implementable class of Comparator interface
class SortByPer implements Comparator<Stud>
{
	@Override
	public int compare(Stud o1, Stud o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getPer()-o1.getPer());
	}
	
}
