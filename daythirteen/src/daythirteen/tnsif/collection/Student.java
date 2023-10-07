//Program to define implementable class of Comparable interface
package daythirteen.tnsif.collection;

public class Student implements Comparable<Student>{
	private int RollNo;
	private String name;
	private float per;
	
	//getter setter
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
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
	
	//Parameterized constructor
	public Student(int rollNo, String name, float per) {
		super();
		RollNo = rollNo;
		this.name = name;
		this.per = per;
	}
	
	//non-Parameterized constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", name=" + name + ", per=" + per + "]";
	}
	
	//compareTo() method from Comparable interface
	@Override
	public int compareTo(Student o)
	{
		//return name.compareTo(o.name);
		//return (int) (per-o.per);
		return o.RollNo-RollNo;
	}
	
	
	
	
	

}
