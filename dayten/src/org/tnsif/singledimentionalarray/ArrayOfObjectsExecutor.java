package org.tnsif.singledimentionalarray;

public class ArrayOfObjectsExecutor {

	public static void main(String[] args) {
		Employees arr[]= new Employees[3];
		arr[0]=new Employees(101, "Sakshi Rahane", 85000.0);
		arr[1]=new Employees(102, "Snehal Darade", 75000.0);
		arr[2]=new Employees(103, "Karuna Pawar", 70000.0);
		
		for(int i=0; i<3; i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
			
		}
			
	}

}
