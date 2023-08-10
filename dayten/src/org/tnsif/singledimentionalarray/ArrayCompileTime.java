//Program to demonstrate on 1D array using compile-time input
package org.tnsif.singledimentionalarray;

public class ArrayCompileTime {

	public static void main(String[] args) {
		//array initialization at the compile time
		int arr[]= {66,33,21,6,1};
		System.out.println(arr[1]);
		System.out.println("\nArray elements are: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
